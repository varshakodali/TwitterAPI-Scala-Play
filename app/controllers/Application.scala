package controllers

import play.api.mvc._
import play.api.libs.oauth._
import play.api.libs.ws.WS
import play.api.Play.current
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller {

  val KEY = ConsumerKey("Fo0Z5Xe5yJiCp3DlNSjxF2D2y", "pB2GSxduc9l3pt8ElGvFXOYMCPyBWTlDz3YlfA1jmEG7Bh7M0r")

  val oauth = OAuth(ServiceInfo(
    "https://api.twitter.com/oauth/request_token",
    "https://api.twitter.com/oauth/access_token",
    "https://api.twitter.com/oauth/authorize", KEY),
    true)

  def index = Action { implicit request =>
    Ok(views.html.index("Twitter API"))
  }

  def authenticate = Action { request =>
    request.getQueryString("oauth_verifier").map { verifier =>
      val tokenPair = sessionTokenPair(request).get
      oauth.retrieveAccessToken(tokenPair, verifier) match {
        case Right(t) =>
          Redirect(routes.Application.timeline()).withSession("token" -> t.token, "secret" -> t.secret)
        case Left(e)  =>
          Ok
      }
    }.getOrElse(
      oauth.retrieveRequestToken("http://localhost:9000/twitter") match {
        case Right(t) =>
          Redirect(oauth.redirectUrl(t.token)).withSession("token" -> t.token, "secret" -> t.secret)
        case Left(e) =>
          Ok
      })
  }

  def timeline = Action.async {request =>
    sessionTokenPair(request) match {
      case Some(credentials) => {
        WS.url("https://api.twitter.com/1.1/statuses/home_timeline.json")
          .withQueryString("count" -> "10")
          .sign(OAuthCalculator(KEY, credentials)).get
          .map(result => Ok(result.json))
      }
      case _ =>
        Future.successful(Redirect(routes.Application.authenticate()))
    }
  }

  private def sessionTokenPair(request: RequestHeader): Option[RequestToken] = {
    for {
      token  <- request.session.data.get("token")
      secret <- request.session.data.get("secret")
    } yield {
      RequestToken(token, secret)
    }
  }
}
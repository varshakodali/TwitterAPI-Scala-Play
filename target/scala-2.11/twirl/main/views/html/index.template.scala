
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Twitter API")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

"""),_display_(/*5.2*/play20/*5.8*/.welcome(message)),format.raw/*5.25*/("""

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Sep 11 00:07:04 PDT 2016
                  SOURCE: C:/Users/varsha/IdeaProjects/TwitterAPI/app/views/index.scala.html
                  HASH: 6a93d46337e3873fe86fe4df9c10694a8bcddf3c
                  MATRIX: 505->1|610->18|640->23|667->42|706->44|736->49|749->55|786->72
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5
                  -- GENERATED --
              */
          
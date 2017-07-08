
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<html lang="en">
<head>
    <title>Twitter API</title>
</head>
<body style="background-color: black">
<div class = "container" style ="height:100%; margin:0px; border:0px">
    <div id = "header">
        <h1 style="color:#DA70D6; padding:5px; text-align:center">"""),_display_(/*9.68*/title),format.raw/*9.73*/("""</h1>
        <p style="text-align:center"><em style="color:#DA70D6"> Accessing your twitter account is now made easier</em></p>
        <p style = "color:white">If you are not on Twitter, You can <a href = "https://twitter.com/">SignUp </a> now</p>
    </div>
    <div>
        <p style = "color:white">
        <a href="/twitter">Click</a> here to access your twitter account
        </p>
        <ol>
            <li>Running a server</li>
            <li>Testing the application</li>
            <li>Deploying it to Heroku</li>
            <li>Creating a production build</li>
        </ol>
    </div>
    <div>
        <h2>More Information</h2>
        <p>This template focuses on exposing RESTful JSON API.</p>
        <p>You won't find there any views, instead, you will be able to build solid endpoints for some frontend or mobile applications.</p>
    </div>
</div>
</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Sep 11 00:07:04 PDT 2016
                  SOURCE: C:/Users/varsha/IdeaProjects/TwitterAPI/app/views/main.scala.html
                  HASH: 81c7af5506fce85ea3d43e03947c08ea048abdcc
                  MATRIX: 509->1|627->31|655->33|952->304|977->309
                  LINES: 19->1|22->1|23->2|30->9|30->9
                  -- GENERATED --
              */
          
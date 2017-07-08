// @SOURCE:C:/Users/varsha/IdeaProjects/TwitterAPI/conf/routes
// @HASH:8bbd467d708d7f581767118caec630e4076aca99
// @DATE:Sun Sep 11 00:07:00 PDT 2016


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:1
private[this] lazy val controllers_Application_timeline0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("twitter/user-timeline"))))
private[this] lazy val controllers_Application_timeline0_invoker = createInvoker(
controllers.Application.timeline,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "timeline", Nil,"GET", """""", Routes.prefix + """twitter/user-timeline"""))
        

// @LINE:2
private[this] lazy val controllers_Application_authenticate1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("twitter"))))
private[this] lazy val controllers_Application_authenticate1_invoker = createInvoker(
controllers.Application.authenticate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Nil,"GET", """""", Routes.prefix + """twitter"""))
        

// @LINE:3
private[this] lazy val controllers_Application_index2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index2_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """twitter/user-timeline""","""controllers.Application.timeline"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """twitter""","""controllers.Application.authenticate"""),("""GET""", prefix,"""controllers.Application.index""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:1
case controllers_Application_timeline0_route(params) => {
   call { 
        controllers_Application_timeline0_invoker.call(controllers.Application.timeline)
   }
}
        

// @LINE:2
case controllers_Application_authenticate1_route(params) => {
   call { 
        controllers_Application_authenticate1_invoker.call(controllers.Application.authenticate)
   }
}
        

// @LINE:3
case controllers_Application_index2_route(params) => {
   call { 
        controllers_Application_index2_invoker.call(controllers.Application.index)
   }
}
        
}

}
     
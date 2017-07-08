// @SOURCE:C:/Users/varsha/IdeaProjects/TwitterAPI/conf/routes
// @HASH:8bbd467d708d7f581767118caec630e4076aca99
// @DATE:Sun Sep 11 00:07:00 PDT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:3
// @LINE:2
// @LINE:1
package controllers {

// @LINE:3
// @LINE:2
// @LINE:1
class ReverseApplication {


// @LINE:1
def timeline(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "twitter/user-timeline")
}
                        

// @LINE:3
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:2
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "twitter")
}
                        

}
                          
}
                  


// @LINE:3
// @LINE:2
// @LINE:1
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:3
// @LINE:2
// @LINE:1
class ReverseApplication {


// @LINE:1
def timeline : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.timeline",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter/user-timeline"})
      }
   """
)
                        

// @LINE:3
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:2
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "twitter"})
      }
   """
)
                        

}
              
}
        


// @LINE:3
// @LINE:2
// @LINE:1
package controllers.ref {


// @LINE:3
// @LINE:2
// @LINE:1
class ReverseApplication {


// @LINE:1
def timeline(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.timeline(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "timeline", Seq(), "GET", """""", _prefix + """twitter/user-timeline""")
)
                      

// @LINE:3
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      

// @LINE:2
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "authenticate", Seq(), "GET", """""", _prefix + """twitter""")
)
                      

}
                          
}
        
    

package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.4*/(""" 

"""),format.raw/*4.1*/("""
"""),format.raw/*5.34*/("""
"""),_display_(/*6.2*/main("ログイン")/*6.14*/{_display_(Seq[Any](format.raw/*6.15*/("""
"""),format.raw/*7.1*/("""<h1>ログイン</h1>
<div>
"""),_display_(/*9.2*/form(CSRF(routes.LoginController.doLogin()))/*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
  """),format.raw/*10.3*/("""<input type="text" name="userName" />
  <input type="password" name="password" />
  <input type="submit" value="login" />
""")))}),format.raw/*13.2*/("""
	"""),_display_(/*14.3*/if(flash.get("errormsg") != null)/*14.36*/{_display_(Seq[Any](format.raw/*14.37*/("""
	"""),format.raw/*15.2*/("""<p>"""),_display_(/*15.6*/flash/*15.11*/.get("errormsg")),format.raw/*15.27*/("""</p>
	""")))}),format.raw/*16.3*/("""
"""),format.raw/*17.1*/("""</div>
<a href=""""),_display_(/*18.11*/routes/*18.17*/.HomeController.index),format.raw/*18.38*/("""">TOP</a>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 29 17:26:45 JST 2018
                  SOURCE: C:/play/bookmaker/app/views/login.scala.html
                  HASH: 2f9ee50903791eee3877a5ff7f7c5f42c4d64ab8
                  MATRIX: 941->1|1016->9|1060->3|1091->26|1120->61|1148->64|1168->76|1206->77|1234->79|1282->102|1334->146|1373->148|1404->152|1560->278|1590->282|1632->315|1671->316|1701->319|1731->323|1745->328|1782->344|1820->352|1849->354|1894->372|1909->378|1951->399
                  LINES: 28->1|31->3|34->1|36->4|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|42->10|45->13|46->14|46->14|46->14|47->15|47->15|47->15|47->15|48->16|49->17|50->18|50->18|50->18
                  -- GENERATED --
              */
          
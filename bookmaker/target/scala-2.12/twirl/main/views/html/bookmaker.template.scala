
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

object bookmaker extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.4*/(""" 

"""),format.raw/*4.1*/("""
"""),format.raw/*5.34*/("""
"""),_display_(/*6.2*/main("BookMaker")/*6.19*/{_display_(Seq[Any](format.raw/*6.20*/("""
"""),format.raw/*7.1*/("""<div>
"""),_display_(/*8.2*/form(CSRF(routes.BookMakerController.doInsert()))/*8.51*/ {_display_(Seq[Any](format.raw/*8.53*/("""
  """),format.raw/*9.3*/("""<input type="text" name="siteName" />
  <input type="text" name="url" />
  <input type="text" name="memo" />
  <input type="text" name="image" />
  <input type="submit" value="更新" />
""")))}),format.raw/*14.2*/("""
	"""),_display_(/*15.3*/if(flash.get("successmsg") != null)/*15.38*/{_display_(Seq[Any](format.raw/*15.39*/("""
	"""),format.raw/*16.2*/("""<p>"""),_display_(/*16.6*/flash/*16.11*/.get("successmsg")),format.raw/*16.29*/("""</p>
	""")))}),format.raw/*17.3*/("""
	
"""),format.raw/*19.1*/("""</div>
<a href=""""),_display_(/*20.11*/routes/*20.17*/.HomeController.index),format.raw/*20.38*/("""">TOP</a>
""")))}),format.raw/*21.2*/("""
"""))
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
                  SOURCE: C:/play/bookmaker/app/views/bookmaker.scala.html
                  HASH: e44a044ac9ae04930a34d373975a1cb997e8bddb
                  MATRIX: 945->1|1020->9|1064->3|1095->26|1124->61|1152->64|1177->81|1215->82|1243->84|1276->92|1333->141|1372->143|1402->147|1621->336|1651->340|1695->375|1734->376|1764->379|1794->383|1808->388|1847->406|1885->414|1917->419|1962->437|1977->443|2019->464|2061->476
                  LINES: 28->1|31->3|34->1|36->4|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|51->19|52->20|52->20|52->20|53->21
                  -- GENERATED --
              */
          
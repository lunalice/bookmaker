
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

object application extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userform: Form[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.25*/(""" 

"""),format.raw/*4.1*/("""
"""),format.raw/*5.34*/("""
"""),_display_(/*6.2*/main("ユーザー登録")/*6.16*/{_display_(Seq[Any](format.raw/*6.17*/("""
"""),format.raw/*7.1*/("""<h1>ユーザー登録</h1>
<div>
	"""),_display_(/*9.3*/helper/*9.9*/.form(routes.ApplicationController.doCreate)/*9.53*/ {_display_(Seq[Any](format.raw/*9.55*/("""
	"""),_display_(/*10.3*/CSRF/*10.7*/.formField),format.raw/*10.17*/("""
	"""),_display_(/*11.3*/inputText(userform("userName"),'_label -> "ユーザー名")),format.raw/*11.53*/("""
	"""),_display_(/*12.3*/inputPassword(userform("password"),'_label -> "パスワード")),format.raw/*12.57*/("""
	"""),_display_(/*13.3*/inputText(userform("fullName"),'_label -> "フルネーム")),format.raw/*13.53*/(""" 
	"""),format.raw/*14.2*/("""<input type="submit" value="登録"> """)))}),format.raw/*14.36*/("""
	"""),_display_(/*15.3*/if(flash.get("errormsg") != null)/*15.36*/{_display_(Seq[Any](format.raw/*15.37*/("""
	"""),format.raw/*16.2*/("""<p>"""),_display_(/*16.6*/flash/*16.11*/.get("errormsg")),format.raw/*16.27*/("""</p>
	""")))}),format.raw/*17.3*/("""
"""),format.raw/*18.1*/("""</div>
<a href=""""),_display_(/*19.11*/routes/*19.17*/.HomeController.index),format.raw/*19.38*/("""">TOP</a>
""")))}))
      }
    }
  }

  def render(userform:Form[Users]): play.twirl.api.HtmlFormat.Appendable = apply(userform)

  def f:((Form[Users]) => play.twirl.api.HtmlFormat.Appendable) = (userform) => apply(userform)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 29 14:38:46 JST 2018
                  SOURCE: C:/play/bookmaker/app/views/application.scala.html
                  HASH: d3c88d59bb6d3160f458e8cc37664d39816f4a18
                  MATRIX: 959->1|1055->30|1100->24|1131->47|1160->82|1188->85|1210->99|1248->100|1276->102|1327->128|1340->134|1392->178|1431->180|1461->184|1473->188|1504->198|1534->202|1605->252|1635->256|1710->310|1740->314|1811->364|1842->368|1907->402|1937->406|1979->439|2018->440|2048->443|2078->447|2092->452|2129->468|2167->476|2196->478|2241->496|2256->502|2298->523
                  LINES: 28->1|31->3|34->1|36->4|37->5|38->6|38->6|38->6|39->7|41->9|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19
                  -- GENERATED --
              */
          
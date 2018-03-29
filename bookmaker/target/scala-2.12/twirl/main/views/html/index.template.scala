
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/(""" """),_display_(/*1.6*/main("Welcome to BookMaker")/*1.34*/ {_display_(Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*2.1*/("""<h1>あなただけのブックマークレット</h1>
<div>
	<ul>
		<li><a href=""""),_display_(/*5.17*/routes/*5.23*/.ApplicationController.index),format.raw/*5.51*/("""">ユーザー登録 </a></li>
		<li> <a href=""""),_display_(/*6.18*/routes/*6.24*/.LoginController.login),format.raw/*6.46*/("""">ログイン</a></li>
	</ul>
	
	"""),_display_(/*9.3*/if(flash.get("successmsg") != null)/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
	"""),format.raw/*10.2*/("""<p>"""),_display_(/*10.6*/flash/*10.11*/.get("successmsg")),format.raw/*10.29*/("""</p>
	""")))}),format.raw/*11.3*/("""
"""),format.raw/*12.1*/("""</div>
""")))}),format.raw/*13.2*/("""
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
                  DATE: Thu Mar 29 16:17:57 JST 2018
                  SOURCE: C:/play/bookmaker/app/views/index.scala.html
                  HASH: 7ec229c96893afb617d16f79c0637bae813ca244
                  MATRIX: 941->1|1037->3|1064->5|1100->33|1139->35|1167->37|1249->93|1263->99|1311->127|1374->164|1388->170|1430->192|1485->222|1528->257|1566->258|1596->261|1626->265|1640->270|1679->288|1717->296|1746->298|1785->307
                  LINES: 28->1|33->1|33->1|33->1|33->1|34->2|37->5|37->5|37->5|38->6|38->6|38->6|41->9|41->9|41->9|42->10|42->10|42->10|42->10|43->11|44->12|45->13
                  -- GENERATED --
              */
          
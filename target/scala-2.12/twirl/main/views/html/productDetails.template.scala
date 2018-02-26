
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

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Long,Form[models.Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, imgForm: Form[models.Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),_display_(/*3.2*/main("Product Image",user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Details</p>
<br>
  <div class="col-sm-12">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*9.8*/if(flash.containsKey("success"))/*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
          """),_display_(/*11.12*/flash/*11.17*/.get("success")),format.raw/*11.32*/("""
        """),format.raw/*12.9*/("""</div>
      """)))}),format.raw/*13.8*/("""

      """),format.raw/*15.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>  
        </tr>
      </thead>

      <tbody>
            <tr>
              """),_display_(/*24.16*/if(env.resource("public/images/productImages/" + id + ".jpg").isDefined)/*24.88*/ {_display_(Seq[Any](format.raw/*24.90*/("""
                """),format.raw/*25.17*/("""<td><img src="/assets/images/productImages/"""),_display_(/*25.61*/(id + ".jpg")),format.raw/*25.74*/(""""/></td>
              """)))}/*26.17*/else/*26.22*/{_display_(Seq[Any](format.raw/*26.23*/("""
                """),format.raw/*27.17*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
              """)))}),format.raw/*28.16*/("""
              """),format.raw/*29.15*/("""<td class="numeric">"""),_display_(/*29.36*/id),format.raw/*29.38*/("""</td>
            </tr>
      </tbody>

    </table>
  </div>
</div>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(id:Long,imgForm:Form[models.Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(id,imgForm,user,env)

  def f:((Long,Form[models.Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (id,imgForm,user,env) => apply(id,imgForm,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 11:09:56 GMT 2018
                  SOURCE: /home/wdd/webapps/play/lab1/app/views/productDetails.scala.html
                  HASH: 596257b6c8925a1955524ab9044953859d063008
                  MATRIX: 1015->1|1203->94|1231->97|1265->123|1304->125|1332->127|1500->270|1540->302|1579->304|1615->313|1687->358|1701->363|1737->378|1773->387|1817->401|1852->409|2025->555|2106->627|2146->629|2191->646|2262->690|2296->703|2339->728|2352->733|2391->734|2436->751|2545->829|2588->844|2636->865|2659->867|2759->937
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|60->28|61->29|61->29|61->29|68->36
                  -- GENERATED --
              */
          
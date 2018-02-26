
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Product],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("Products",user)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*11.17*/routes/*11.23*/.HomeController.index(0)),format.raw/*11.47*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*12.8*/for(c <- categories) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""
        """),format.raw/*13.9*/("""<a href=""""),_display_(/*13.19*/routes/*13.25*/.HomeController.index(c.getId)),format.raw/*13.55*/("""" class="list-group-item">"""),_display_(/*13.82*/c/*13.83*/.getName),format.raw/*13.91*/("""
          """),format.raw/*14.11*/("""<span class="badge">"""),_display_(/*14.32*/c/*14.33*/.getProducts.size()),format.raw/*14.52*/("""</span>
        </a>
      """)))}),format.raw/*16.8*/("""
    """),format.raw/*17.5*/("""</div>
  </div>
  <div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*21.8*/if(flash.containsKey("success"))/*21.40*/ {_display_(Seq[Any](format.raw/*21.42*/("""
        """),format.raw/*22.9*/("""<div class="alert alert-success">
          """),_display_(/*23.12*/flash/*23.17*/.get("success")),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""</div>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Category</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*40.10*/for(p<-products) yield /*40.26*/ {_display_(Seq[Any](format.raw/*40.28*/("""
            """),format.raw/*41.13*/("""<tr>
              """),_display_(/*42.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*42.104*/ {_display_(Seq[Any](format.raw/*42.106*/("""
                """),format.raw/*43.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*43.72*/(p.getId + ".jpg")),format.raw/*43.90*/(""""/></td>
              """)))}/*44.17*/else/*44.22*/{_display_(Seq[Any](format.raw/*44.23*/("""
                """),format.raw/*45.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
              """)))}),format.raw/*46.16*/("""
            
            """),format.raw/*48.13*/("""<td class="numeric">"""),_display_(/*48.34*/p/*48.35*/.getId),format.raw/*48.41*/("""</td>
            <td><a href=""""),_display_(/*49.27*/routes/*49.33*/.HomeController.productDetails(p.getId)),format.raw/*49.72*/("""">"""),_display_(/*49.75*/p/*49.76*/.getName),format.raw/*49.84*/("""</a></td>
            <td>"""),_display_(/*50.18*/p/*50.19*/.getCategory.getName),format.raw/*50.39*/("""</td>        
            <td>"""),_display_(/*51.18*/p/*51.19*/.getDescription),format.raw/*51.34*/("""</td>
            <td  class="numeric">"""),_display_(/*52.35*/p/*52.36*/.getStock),format.raw/*52.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*53.37*/("%.2f".format(p.getPrice))),format.raw/*53.64*/("""</td>
            <td>
              <a href=""""),_display_(/*55.25*/routes/*55.31*/.HomeController.updateProduct(p.getId)),format.raw/*55.69*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*59.25*/routes/*59.31*/.HomeController.deleteProduct(p.getId)),format.raw/*59.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*64.10*/("""
      """),format.raw/*65.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*70.17*/routes/*70.23*/.HomeController.addProduct()),format.raw/*70.51*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}),format.raw/*76.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 26 11:09:56 GMT 2018
                  SOURCE: /home/wdd/webapps/play/lab1/app/views/index.scala.html
                  HASH: 393326d1e3dcc2d99fe270a5764ce45640345158
                  MATRIX: 1023->1|1238->120|1266->123|1295->144|1334->146|1362->148|1544->303|1559->309|1604->333|1682->385|1718->405|1758->407|1794->416|1831->426|1846->432|1897->462|1951->489|1961->490|1990->498|2029->509|2077->530|2087->531|2127->550|2185->578|2217->583|2361->701|2402->733|2442->735|2478->744|2550->789|2564->794|2600->809|2636->818|2680->832|2714->839|3033->1131|3065->1147|3105->1149|3146->1162|3193->1182|3291->1270|3332->1272|3377->1289|3459->1344|3498->1362|3541->1387|3554->1392|3593->1393|3638->1410|3758->1499|3812->1525|3860->1546|3870->1547|3897->1553|3956->1585|3971->1591|4031->1630|4061->1633|4071->1634|4100->1642|4154->1669|4164->1670|4205->1690|4263->1721|4273->1722|4309->1737|4376->1777|4386->1778|4416->1787|4485->1829|4533->1856|4607->1903|4622->1909|4681->1947|4878->2117|4893->2123|4952->2161|5172->2350|5206->2357|5281->2405|5296->2411|5345->2439|5478->2542
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|48->16|49->17|53->21|53->21|53->21|54->22|55->23|55->23|55->23|56->24|57->25|58->26|72->40|72->40|72->40|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|78->46|80->48|80->48|80->48|80->48|81->49|81->49|81->49|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|87->55|87->55|87->55|91->59|91->59|91->59|96->64|97->65|102->70|102->70|102->70|108->76
                  -- GENERATED --
              */
          
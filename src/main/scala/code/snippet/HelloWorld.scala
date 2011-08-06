package code 
package snippet 

import scala.xml.{NodeSeq, Text}
import net.liftweb.http.SHtml
import net.liftweb.util._
import net.liftweb.common._
import java.util.Date
import code.lib._
import Helpers._

class HelloWorld {
  lazy val date: Box[Date] = DependencyFactory.inject[Date] // inject the date

  // replace the contents of the element with id "time" with the date
  def howdy = {
    SHtml.ajaxCall(net.liftweb.http.js.JE.JsVar("args"), _ => ())
    "#time *" #> date.map(_.toString)
  }

  /*
   lazy val date: Date = DependencyFactory.time.vend // create the date via factory

   def howdy = "#time *" #> date.toString
   */
}

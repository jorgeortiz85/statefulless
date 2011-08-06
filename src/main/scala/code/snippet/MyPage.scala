package code 
package snippet 

import net.liftweb.common.{Box, Full}
import net.liftweb.sitemap.Loc
import net.liftweb.sitemap.Loc.{LocParam, LinkText, Link}

case class MyData(data: String)

object MyPage extends Loc[MyData] {
  override def params: List[LocParam[MyData]] = Nil
  override def defaultValue: Box[MyData] = Full(MyData("MyData"))
  override def text: LinkText[MyData] = "MyPageText"
  override def link: Link[MyData] = new Link[MyData]("mypage" :: Nil, true)
  override def name: String = "MyPage"

  override def stateless_? = true
}

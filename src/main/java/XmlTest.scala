import java.util.Date

/**
  * Created by Nishikant on 3/26/2016.
  */
object XmlTest {

  def main(arr: Array[String]): Unit = {
    val page =
      <html>
        <head>
          <title>Hello XHTML world</title>
        </head>
        <body>
          <h1>Hello world</h1>
          <p>
            <a href="scala-lang.org">Scala</a>
            talks XHTML</p>
        </body>
      </html>
    println(page.toString)

    def getDate(s: String) = <lol>
      Hello,
      {s}
      BC! Today is
      {new Date()}
    </lol>
    println(getDate("asdf"))
  }
}

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by Nishikant on 3/26/2016.
  */

object HigherOrderFuncTest {
  def main(args: Array[String]) {
    println(apply(s => new SimpleDateFormat("yyyyMMdd").parse(s), "20160326"))
  }

  def apply(f: String => Date, s: String): Date = {
    f(s)
  }
}

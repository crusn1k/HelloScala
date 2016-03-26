/**
  * Created by Nishikant on 3/27/2016.
  */
object CurryTest {
  def main(args: Array[String]): Unit = {
    println(f(i => i * i)(2))
  }

  def f(x: Int => Int)(a: Int): Int = x(a)
}

/**
  * Created by Nishikant on 4/2/2016.
  */

case class Generic[A](a: A) {
  def apply(i: A): A = {
    a
  }

  def boo[B <: A](x: A): B = {
    println(a)
    a.asInstanceOf[B]
  }

  def lol(): (Int, Int, String) = {
    (1, 2, "madarbhagat")
  }
}

object GenericTest {
  def main(args: Array[String]): Unit = {
    println(Generic[Any](1).boo[Int](1))
    val x: (Int, Int, String) = Generic(1).lol()
    println(x)
    println(Generic(1)(2))
  }
}

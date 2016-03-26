trait RichIterator extends AbsIterator {
  def foreach(f: T => Unit) {
    while (hasNext) f(next)
  }
}

/**
  * Created by Nishikant on 3/26/2016.
  */

abstract class AbsIterator {
  type T

  def hasNext: Boolean

  def next: T
}

class StringIterator(s: String) extends AbsIterator {
  type T = Char
  private var i = 0

  def hasNext = i < s.length()

  def next = {
    val ch = s charAt i
    i += 1
    ch
  }
}

object TraitTest {
  def main(args: Array[String]) {
    class Iter extends StringIterator("Hello World!") with RichIterator
    val iter = new Iter
    iter foreach println
  }
}

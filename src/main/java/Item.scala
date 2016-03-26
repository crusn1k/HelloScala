/**
  * Created by Nishikant on 3/26/2016.
  */
class Item(name: String) {

  def whatsMyName() {
    println(name)
  }

  override def toString = s"Item($name)"
}

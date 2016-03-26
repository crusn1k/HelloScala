/**
  * Created by Nishikant on 3/26/2016.
  */
class Item(iname: String) {
  var name: String = iname;

  def hiItem() {
    println(name);
  }

  override def toString = s"Item($name)"
}

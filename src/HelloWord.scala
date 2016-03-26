/**
  * Created by Nishikant on 3/26/2016.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5);
    val iterator: Iterator[AnyVal] = list.iterator;
    while (iterator.hasNext) {
      println(iterator.next());
    }

    val item: Item = new Item("swastika");
    item.hiItem();
    println(item);
  }
}

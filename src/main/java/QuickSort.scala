/**
  * Created by Nishikant on 3/27/2016.
  */

object QuickSort {
  def main(args: Array[String]) {
    def sort(xs: Array[Int]): Array[Int] = {
      if (xs.length <= 1) xs
      else {
        val pivot = xs(xs.length / 2)
        Array.concat(sort(xs filter (pivot >)), xs filter (pivot ==), sort(xs filter (pivot >)))
      }
    }
    val arr: Array[Int] = new Array[Int](7)
    arr(0) = 211
    arr(2) = 5111
    arr(3) = 2311
    arr(4) = 112
    arr(5) = 1513
    arr(6) = 1132


  }
}

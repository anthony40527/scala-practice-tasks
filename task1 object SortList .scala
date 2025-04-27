object SortList {
  def main(args: Array[String]): Unit = {
    val numbers = List(4, 1, 7, 3)

    println("Original List:")
    println(numbers)

    val ascending = numbers.sorted
    println("Ascending Order:")
    println(ascending)

    val descending = numbers.sorted(Ordering[Int].reverse)
    println("Descending Order:")
    println(descending)
  }
}

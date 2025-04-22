object SortList {
  def sortNumbers(list: List[Int], ascending: Boolean = true): List[Int] = {
    if (ascending) list.sorted
    else list.sorted(Ordering[Int].reverse)
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(5, 2, 8, 1, 9, 3)
    println("Original List: " + numbers)

    val ascendingSorted = sortNumbers(numbers, ascending = true)
    println("Ascending Order: " + ascendingSorted)

    val descendingSorted = sortNumbers(numbers, ascending = false)
    println("Descending Order: " + descendingSorted)
  }
}

object EvenOddSeparator {

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    val (evens, odds) = separateEvenOdd(numbers)

    println(s"Even Numbers: $evens")
    println(s"Odd Numbers: $odds")
  }

  def separateEvenOdd(lst: List[Int]): (List[Int], List[Int]) = {
    val evens = lst.filter(_ % 2 == 0)
    val odds = lst.filter(_ % 2 != 0)
    (evens, odds)
  }
}

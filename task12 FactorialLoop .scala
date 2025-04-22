object FactorialLoop {

  def main(args: Array[String]): Unit = {
    val number = 5
    val result = factorial(number)
    println(s"Factorial of $number is: $result")
  }

  def factorial(n: Int): Int = {
    var result = 1
    for (i <- 1 to n) {
      result *= i
    }
    result
  }
}

object SumOfDigits {

  def main(args: Array[String]): Unit = {
    val number = -1234
    val sum = sumOfDigits(number)

    println(s"Sum of digits of $number is: $sum")
  }

  def sumOfDigits(num: Int): Int = {
    num.abs.toString.map(_.asDigit).sum
  }
}

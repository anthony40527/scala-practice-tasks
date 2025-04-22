object BasicCalculator {

  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 3
    val result = add(num1, num2)
    
    println(s"The result of adding $num1 and $num2 is: $result")
  }

  def add(a: Double, b: Double): Double = {
    a + b
  }
}

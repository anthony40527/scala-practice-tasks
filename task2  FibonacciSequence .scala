object FibonacciSequence {
  def generateFibonacci(n: Int): List[Int] = {
    if (n <= 0) return List()
    if (n == 1) return List(0)
    
    var fibList = List(0, 1)
    for (_ <- 2 until n) {
      val next = fibList.takeRight(2).sum
      fibList = fibList :+ next
    }
    fibList
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    val result = generateFibonacci(n)
    println(s"First $n Fibonacci numbers: $result")
  }
}

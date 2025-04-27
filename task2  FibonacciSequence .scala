object FibonacciSequence {
  def main(args: Array[String]): Unit = {
    val n = 10 

    var first = 0 
    var second = 1 

    println(s"First $n Fibonacci numbers:")

   
    for (i <- 1 to n) {
      print(first + " ")

      val next = first + second 
      first = second 
      second = next 
    }
  }
}

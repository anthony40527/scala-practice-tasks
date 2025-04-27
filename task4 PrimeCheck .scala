
object PrimeCheck {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) return false
    for (i <- 2 until n) {
      if (n % i == 0) return false
    }
    true
  }

  def main(args: Array[String]): Unit = {
    println("Enter a number to check if it is prime:")

    val number = readInt() 
    if (isPrime(number))
      println(s"$number is a prime number.")
    else
      println(s"$number is not a prime number.")
  }
}

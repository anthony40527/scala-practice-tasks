object PrimeCheck {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else {
      var i = 2
      while (i <= math.sqrt(n).toInt) {
        if (n % i == 0) return false
        i += 1
      }
      true
    }
  }

  def main(args: Array[String]): Unit = {
    val number = 29// You can change this number to test
    val result = isPrime(number)
    if (result)
      println(s"$number is a prime number.")
    else
      println(s"$number is not a prime number.")
  }
}

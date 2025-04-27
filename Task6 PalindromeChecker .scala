object PalindromeChecker {

  def main(args: Array[String]): Unit = {
    println("Enter a text to check if it is a palindrome:")

    val inputText = readLine()
    val isPalindrome = checkPalindrome(inputText)

    if (isPalindrome)
      println("It is a palindrome.")
    else
      println("It is not a palindrome.")
  }

  def checkPalindrome(text: String): Boolean = {
    val cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase
    cleanText == cleanText.reverse
  }
}

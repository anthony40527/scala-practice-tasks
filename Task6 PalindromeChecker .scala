object PalindromeChecker {

  def main(args: Array[String]): Unit = {
    val inputText = "Never odd or even"
    val isPalindrome = checkPalindrome(inputText)
    println(s"Is palindrome: $isPalindrome")
  }

  def checkPalindrome(text: String): Boolean = {
   
    val cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase
    
   
    cleanText == cleanText.reverse
  }
}

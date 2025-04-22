object PalindromeChecker {

  def main(args: Array[String]): Unit = {
    val inputText = "Never odd or even"
    val isPalindrome = checkPalindrome(inputText)
    println(s"Is palindrome: $isPalindrome")
  }

  def checkPalindrome(text: String): Boolean = {
    // Clean the input by removing spaces, punctuation and converting to lowercase
    val cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase
    
    // Check if the cleaned text is equal to its reverse
    cleanText == cleanText.reverse
  }
}

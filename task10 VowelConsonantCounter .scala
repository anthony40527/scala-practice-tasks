object VowelConsonantCounter {

  def main(args: Array[String]): Unit = {
    val inputString = "Hello World"
    val (vowels, consonants) = countVowelsAndConsonants(inputString)

    println(s"Vowels: $vowels, Consonants: $consonants")
  }

  def countVowelsAndConsonants(text: String): (Int, Int) = {
    // Define vowels (both uppercase and lowercase)
    val vowels = "aeiouAEIOU"
    
    // Initialize counters for vowels and consonants
    var vowelCount = 0
    var consonantCount = 0
    
    // Loop through each character in the string
    for (char <- text) {
      if (char.isLetter) {
        if (vowels.contains(char)) {
          vowelCount += 1
        } else {
          consonantCount += 1
        }
      }
    }

    // Return the counts as a tuple
    (vowelCount, consonantCount)
  }
}

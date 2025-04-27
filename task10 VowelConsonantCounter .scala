object VowelConsonantCounter {

  def main(args: Array[String]): Unit = {
    val inputString = "Hello World"
    val (vowels, consonants) = countVowelsAndConsonants(inputString)

    println(s"Vowels: $vowels, Consonants: $consonants")
  }

  def countVowelsAndConsonants(text: String): (Int, Int) = {
    
    val vowels = "aeiouAEIOU"
    
   
    var vowelCount = 0
    var consonantCount = 0
    
    
    for (char <- text) {
      if (char.isLetter) {
        if (vowels.contains(char)) {
          vowelCount += 1
        } else {
          consonantCount += 1
        }
      }
    }

   
    (vowelCount, consonantCount)
  }
}

object LongestWordsFinder {

  def main(args: Array[String]): Unit = {
    val sentence = "This is an example sentence for testing the longest word"
    val longestWords = findLongestWords(sentence)

    println(s"Top 3 longest words: ${longestWords.mkString(", ")}")
  }

  def findLongestWords(sentence: String): List[String] = {
    val words = sentence.split("\\s+").toList 
    val sortedWords =
      words.sortBy(-_.length) 
    val top3Words = sortedWords.take(3) 

    top3Words
  }
}

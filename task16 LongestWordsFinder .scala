object LongestWordsFinder {

  def main(args: Array[String]): Unit = {
    val sentence = "This is an example sentence for testing the longest word"
    val longestWords = findLongestWords(sentence)

    println(s"Top 3 longest words: ${longestWords.mkString(", ")}")
  }

  def findLongestWords(sentence: String): List[String] = {
    val words = sentence.split("\\s+").toList // Split sentence into words
    val sortedWords =
      words.sortBy(-_.length) // Sort words by length in descending order
    val top3Words = sortedWords.take(3) // Take top 3 longest words

    top3Words
  }
}

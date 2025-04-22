object WordFrequencyCounter {

  def main(args: Array[String]): Unit = {
    val inputText = "The quick brown fox jumps over the lazy dog. The fox jumped over the dog."
    val topWords = getTop5Words(inputText)
    
    topWords.foreach(println)
  }

  def getTop5Words(text: String): List[(String, Int)] = {
    val words = text.toLowerCase.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+")
    
    val wordCount = words.groupBy(identity).view.mapValues(_.length).toList
    val sortedWords = wordCount.sortBy { case (word, count) => (-count, word) }

    sortedWords.take(5)
  }
}

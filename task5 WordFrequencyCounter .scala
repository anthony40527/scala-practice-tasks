object WordFrequencyCounter {

  def main(args: Array[String]): Unit = {
    val inputText = "The quick brown fox jumps over the lazy dog. The fox jumped over the dog."
    val topWords = getTop5Words(inputText)
    
    topWords.foreach(println)
  }

  def getTop5Words(text: String): List[(String, Int)] = {
    text.toLowerCase.replaceAll("[^a-zA-Z0-9\\s]", "")
      .split("\\s+")
      .groupBy(identity)
      .mapValues(_.length)
      .toList
      .sortBy { case (word, count) => (-count, word) }
      .take(5)
  }
}


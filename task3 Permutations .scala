object Permutations {
  def getPermutations(chars: List[Char]): List[String] = {
    if (chars.isEmpty) List("")
    else {
      var result = List[String]()
      
      for (i <- 0 until chars.length) {
        val currentChar = chars(i) 
        val remainingChars = chars.take(i) ++ chars.drop(i + 1) 
        
       
        val subPermutations = getPermutations(remainingChars)

        
        for (perm <- subPermutations) {
          result = result :+ currentChar + perm
        }
      }
      result
    }
  }

  def main(args: Array[String]): Unit = {
    val inputChars = List('A', 'N', 'T', 'O')
    val permutations = getPermutations(inputChars)
    println(s"Permutations of ${inputChars.mkString(", ")}:")
    permutations.foreach(println)
  }
}

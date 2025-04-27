object Permutations {
  def getPermutations(chars: List[Char]): List[String] = {
    if (chars.isEmpty) List("")
    else {
      for {
        i <- chars.indices.toList
        rest = chars.take(i) ++ chars.drop(i + 1)
        perm <- getPermutations(rest)
      } yield chars(i) + perm
    }
  }

  def main(args: Array[String]): Unit = {
    val inputChars = List('A', 'N', 'T', 'O')
    val permutations = getPermutations(inputChars)
    println(s"Permutations of ${inputChars.mkString(", ")}:")
    permutations.foreach(println)
  }
}

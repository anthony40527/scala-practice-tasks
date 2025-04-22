object CharCounter {

  def main(args: Array[String]): Unit = {
    val inputString = "hello world"
    val targetChar = 'o'
    val count = countCharacter(inputString, targetChar)

    println(s"Character '$targetChar' appears $count times in \"$inputString\".")
  }

  def countCharacter(str: String, ch: Char): Int = {
    str.count(_ == ch)
  }
}

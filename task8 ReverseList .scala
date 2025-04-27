object ReverseList {

  
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val reversedList = reverseList(inputList)
    
    println(s"Reversed List: $reversedList")
  }

  
  def reverseList(lst: List[Int]): List[Int] = {
    lst.reverse
  }
}

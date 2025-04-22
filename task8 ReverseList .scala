object ReverseList {

  // The main method to execute the program
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val reversedList = reverseList(inputList)
    
    println(s"Reversed List: $reversedList")
  }

  // Function to reverse the list
  def reverseList(lst: List[Int]): List[Int] = {
    lst.reverse
  }
}

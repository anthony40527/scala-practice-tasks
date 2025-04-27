object MaxMinFinder {

  def main(args: Array[String]): Unit = {
    val inputList = List(5, 3, 8, 1, 6)
    val (min, max) = findMinMax(inputList)
    
    println(s"Minimum: $min, Maximum: $max")
  }

  def findMinMax(lst: List[Int]): (Int, Int) = {
   
    var min = lst.head
    var max = lst.head
    
    
    for (num <- lst.tail) {
      if (num < min) min = num
      if (num > max) max = num
    }
    
    (min, max)
  }
}

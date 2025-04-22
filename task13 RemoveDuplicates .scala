object RemoveDuplicates {

  def main(args: Array[String]): Unit = {
    val originalList = List(1, 2, 2, 3, 4, 4, 5)
    val uniqueList = removeDuplicates(originalList)

    println(s"Original List: $originalList")
    println(s"List without duplicates: $uniqueList")
  }

  def removeDuplicates[A](list: List[A]): List[A] = {
    list.distinct
  }
}

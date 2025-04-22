object MergeSortedLists {

  def main(args: Array[String]): Unit = {
    val list1 = List(1, 3, 5)
    val list2 = List(2, 4, 6)
    val mergedList = mergeSortedLists(list1, list2)

    println(s"Merged Sorted List: $mergedList")
  }

  def mergeSortedLists(list1: List[Int], list2: List[Int]): List[Int] = {
    (list1, list2) match {
      case (Nil, _) => list2
      case (_, Nil) => list1
      case (h1 :: t1, h2 :: t2) =>
        if (h1 < h2)
          h1 :: mergeSortedLists(t1, list2)
        else
          h2 :: mergeSortedLists(list1, t2)
    }
  }
}

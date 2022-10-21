def merge(left: List[Int], right: List[Int]): List[Int] = {
  val (output, _, _) = (0 until left.length + right.length).foldLeft(List[Int](), left, right) { (triple, _) =>
    val (merged, leftRemaining, rightRemaining) = triple
    (leftRemaining, rightRemaining) match {
      case (Nil, r :: rTail)             => (r :: merged, Nil, rTail)
      case (l :: lTail, Nil)             => (l :: merged, lTail, Nil)
      case (l :: lTail, r :: _) if l < r => (l :: merged, lTail, rightRemaining)
      case (_, r :: rTail)               => (r :: merged, leftRemaining, rTail)
      case _                             => (merged, leftRemaining, rightRemaining)

    }
  }
  output.reverse

}

def mergeSort(arr: IndexedSeq[Int]): List[Int] =
  arr.length match {
//    case 0 => List()
    case 0 | 1 => arr.toList
    case _ =>
      val (left, right) = arr.splitAt(arr.length / 2)
      val sortedLeft    = mergeSort(left)
      val sortedRight   = mergeSort(right)
      merge(sortedLeft, sortedRight)
  }

val rVector = Vector(3, 6, 1, 5, 2, 0, 8)
val rector  = Vector()
val rector1  = Vector(1)

mergeSort(rVector)
mergeSort(rector)
mergeSort(rector1)
//rector.splitAt(0)

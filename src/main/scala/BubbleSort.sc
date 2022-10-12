def bubbleSort(arr: Array[Int]) = {
  val n = arr.length
  for (k <- 1 until n; j <- 0 until n - 1) {
    if (arr(j) > arr(j + 1)) {
      val x = arr(j)
      arr(j) = arr(j + 1)
      arr(j + 1) = x
    }
  }
}

def bubbleSort2(arr: Array[Int]) = {
  val n = arr.length
  for (k <- 1 until n; j <- 0 until n - 1) {
    (arr(j), arr(j + 1)) match {
      case (x, y) if x > y =>
        arr(j) = y
        arr(j + 1) = x
      case _ =>
    }
  }
}
def bubbleSort3(arr: Array[Int]) = {
  val n = arr.length
  for (k <- 1 until n; j <- 0 until n - 1 if arr(j) > arr(j + 1)) {
    (arr(j), arr(j + 1)) match {
      case (x, y) =>
        arr(j) = y
        arr(j + 1) = x
    }
  }
}
def bubbleSort4(arr: Array[Int]) = {
  val n = arr.length
  for (k <- 1 until n; j <- 0 until n - k if arr(j) > arr(j + 1)) {
    (arr(j), arr(j + 1)) match {
      case (x, y) =>
        arr(j) = y
        arr(j + 1) = x
    }
  }
}

val rArray = Array(3, 6, 1, 5, 2, 0, 8)
val rArray2 = Array(3, 6, 1, 5, 2, 0, 8)

bubbleSort3(rArray)
bubbleSort4(rArray2)
rArray
rArray2

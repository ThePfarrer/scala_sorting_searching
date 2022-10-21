val myList = List(2, 2, 3, 4, 5, 7)

myList.indices.find(i => myList(i) == 75).getOrElse(-1)

def substringSearch(text: String, pattern: String): Int =
  text.indices.find { i =>
    i + pattern.length < text.length &&
    pattern.indices
      .forall(j => text(j + i) == pattern(j))
  }
    .getOrElse(-1)

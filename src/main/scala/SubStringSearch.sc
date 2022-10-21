def substringSearch(text: String, pattern: String) = {
  var index         = -1
  val textLength    = text.length
  val patternLength = pattern.length

  for (i <- 0 to (textLength - patternLength) if index == -1) {
    var j = 0
    while (j < patternLength && text(i + j) == pattern(j)) {
      j += 1
    }
    if (j == patternLength) index = i
  }
  index
}

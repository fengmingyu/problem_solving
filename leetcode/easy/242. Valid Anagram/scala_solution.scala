object Solution {
  def isAnagram(s: String, t: String): Boolean = {
    if (s.length != t.length) {
      false
    } else {
      val counter = new Array[Int](26)
      s.foreach { c =>
        counter(c - 'a') += 1
      }
      t.foreach { c =>
        counter(c - 'a') -= 1
        if (counter(c - 'a') < 0) {
          return false
        }
      }
      true
    }
  }
}
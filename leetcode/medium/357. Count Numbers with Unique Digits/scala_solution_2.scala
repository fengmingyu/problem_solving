object Solution {
  def countNumbersWithUniqueDigits(n: Int): Int = {
    if (n >= 10) {
      this.countNumbersWithUniqueDigits(10)
    } else if (n == 0) {
      1
    } else {
      val lower_part: Int = this.countNumbersWithUniqueDigits(n-1)
      var temp_product: Int = 9
      for (i <- 1 until n) {
        temp_product *= (10 -i)
      }
      lower_part + temp_product
    }
  }
}
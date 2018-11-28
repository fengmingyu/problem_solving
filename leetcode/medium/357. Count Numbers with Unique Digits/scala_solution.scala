object Solution {
  def countNumbersWithUniqueDigits(n: Int): Int = {
    if (n >= 10) {
      this.countNumbersWithUniqueDigits(10)
    } else if (n == 0) {
      1
    } else {
      var k: Int = n
      var sum_num: Int = 0
      while (k > 1) {
        var temp_product = 9
        for (i <- 1 until k) {
          temp_product *= (10 -i)
        }
        sum_num += temp_product
        k = k - 1
      }
      sum_num += 10
      sum_num
    }
  }
}
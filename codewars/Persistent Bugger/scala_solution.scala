object Multiplication {

  def persistence(n: Int): Int = {
    var count: Int = 0
    var temp: Int = n
    while (temp >= 10) {
      temp = digitMultiply(temp)
      count += 1
    }
    count
  }

  def digitMultiply(n: Int): Int = {
    var result: Int = 1
    var temp: Int = n
    while (temp > 0) {
      result *= temp % 10
      temp = temp/10
    }
    result
  }
}
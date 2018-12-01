object Rain {

  def mean(town: String, strng: String): Double = {
    val data = parseData(town, strng)
    if (data.size == 0) {
      - 1.0
    } else {
      data.sum / data.length
    }
  }

  def variance(town: String, strng: String): Double = {
    val data = parseData(town, strng)
    if (data.size == 0) {
      - 1.0
    } else {
      val avg = mean(town, strng)
      data.map(num => (num - avg) * (num - avg)).sum / data.length
    }
  }

  def parseData(town: String, strng: String): Array[Double] = {
    val temp_list: Array[String] = strng.split("\n")
    val data_list: Array[Array[String]] = temp_list.map(_.split(":"))
    for (data <- data_list) {
      if (data(0) == town) {
        val town_data: String = data(1)
        return town_data.split(",").map(_.split(" ")(1).toDouble)
      }
    }
    Array()
  }

}

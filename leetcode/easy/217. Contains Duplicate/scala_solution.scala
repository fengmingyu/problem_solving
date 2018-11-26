object Solution {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val sorted_nums = nums.sorted
    for (i <- 0 until (sorted_nums.length - 1)) {
      if (sorted_nums(i) == sorted_nums(i+1)) {
        return true
      }
    }
    false
  }
}
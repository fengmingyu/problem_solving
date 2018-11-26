class Solution:
    """
    @param nums: The integer array you should partition
    @param k: An integer
    @return: The index after partition
    """
    def partitionArray(self, nums, k):
        pointer = len(nums) - 1
        i = 0
        while i <= pointer:
            if nums[i] >= k:
                nums[i], nums[pointer] = nums[pointer], nums[i]
                pointer -= 1
                continue
            i += 1
        return pointer + 1
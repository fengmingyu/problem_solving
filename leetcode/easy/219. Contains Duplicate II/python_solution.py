class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        if len(nums) == len(set(nums)):
            return False
        dic = {}
        for idx, num in enumerate(nums):
            if num not in dic:
                dic[num] = idx
            elif idx - dic[num] <= k:
                return True
            else:
                dic[num] = idx
        return False

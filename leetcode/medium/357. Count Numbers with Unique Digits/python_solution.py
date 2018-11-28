class Solution(object):
    def countNumbersWithUniqueDigits(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n >= 10:
            return self.countNumbersWithUniqueDigits(10)
        if n == 0:
            return 1
        sum_num = 0
        while n > 1:
            temp_product = 9
            for i in range(1, n):
                temp_product *= (10 - i)
            sum_num += temp_product
            n -= 1
        sum_num += 10
        return sum_num

class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n == 1:
            return "1"
        a = self.countAndSay(n-1)
        temp = [a[0]]
        j = 0
        for i in range(len(a)):
            if temp[-1] != a[i]:
                temp.insert(-1, str(j))
                temp.append(a[i])
                j = 1
            else:
                j += 1
        temp.insert(-1, str(j))
        return "".join(temp)

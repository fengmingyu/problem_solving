class Solution(object):
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        multilist = [[1 for col in range(m)] for row in range(n)]
        for i in range(1, m):
            for j in range(1, n):
                multilist[j][i] = multilist[j-1][i] + multilist[j][i-1]
        return multilist[n-1][m-1]
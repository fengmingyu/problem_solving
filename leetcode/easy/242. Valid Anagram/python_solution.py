class Solution(object):
    def isAnagram(self, s, t):
        if set(s) != set(t):
            return False
        for i in set(s):
            if s.count(i) != t.count(i):
                return False
        return True
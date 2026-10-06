class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        o = 0
        res = 0
        for c in s:
            if c == '(':
                o += 1
            else:
                if o > 0:
                    o -= 1
                else:
                    res += 1
        return res + o
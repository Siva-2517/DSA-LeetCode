class Solution:
    def toHex(self, num: int) -> str:
        if num == 0:
            return "0"
        if num < 0:
            num += 2**32
        s = ""
        h = "0123456789abcdef"
        while num:
            s = h[num % 16] + s
            num //= 16
        return s
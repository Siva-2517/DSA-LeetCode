class Solution:
    def convertToBase7(self, num: int) -> str:
        if num == 0:
            return "0"
        sign = ""
        if num < 0:
            sign = "-"
            num = -num
        s = ""
        while num > 0:
            s += str(num % 7)
            num //= 7
        return sign + s[::-1]
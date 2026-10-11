class Solution:
    def sumOfSquares(self, a: List[int]) -> int:
        n = len(a)
        tot = 0
        for i in range(1, n + 1):
            if n % i == 0:
                tot += a[i - 1] ** 2
        return tot
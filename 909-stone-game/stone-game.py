class Solution:
    def stoneGame(self, piles: List[int]) -> bool:
        n = len(piles)
        dp = [[0] * n for _ in range(n)]

        for i in range(n):
            dp[i][i] = piles[i]

        for size in range(2, n + 1):
            for i in range(n - size + 1):
                j = i + size - 1
                left = piles[i] - dp[i + 1][j]
                right = piles[j] - dp[i][j - 1]
                dp[i][j] = max(left, right)

        return dp[0][n - 1] > 0
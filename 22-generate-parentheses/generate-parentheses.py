class Solution:
    def dfs(self, s, o, c, n, ans):
        if len(s) == 2 * n:
            ans.append(s)
            return
        if o < n:
            self.dfs(s + "(", o + 1, c, n, ans)
        if c < o:
            self.dfs(s + ")", o, c + 1, n, ans)

    def generateParenthesis(self, n):
        ans = []
        self.dfs("", 0, 0, n, ans)
        return ans
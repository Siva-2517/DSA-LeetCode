class Solution:
    def removeInvalidParentheses(self, s):
        res = set()
        a = b = 0
        for c in s:
            if c == '(':
                a += 1
            elif c == ')':
                if a:
                    a -= 1
                else:
                    b += 1

        def dfs(i, a, b, op, path):
            if i == len(s):
                if a == 0 and b == 0 and op == 0:
                    res.add(''.join(path))
                return

            c = s[i]

            if c == '(' and a:
                dfs(i + 1, a - 1, b, op, path)

            elif c == ')' and b:
                dfs(i + 1, a, b - 1, op, path)

            if c == '(':
                path.append(c)
                dfs(i + 1, a, b, op + 1, path)
                path.pop()

            elif c == ')' and op:
                path.append(c)
                dfs(i + 1, a, b, op - 1, path)
                path.pop()

            elif c not in '()':
                path.append(c)
                dfs(i + 1, a, b, op, path)
                path.pop()

        dfs(0, a, b, 0, [])
        return list(res)
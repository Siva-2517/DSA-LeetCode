class Solution:
    def reverseParentheses(self, s: str) -> str:
        st = []
        for c in s:
            if c == ')':
                t = []
                while st[-1] != '(':
                    t.append(st.pop())
                st.pop()
                st.extend(t)
            else:
                st.append(c)
        return ''.join(st)
class Solution:
    def isValid(self, s: str) -> bool:
        st = []

        for c in s:
            if c in "([{":
                st.append(c)
            else:
                if not st:
                    return False

                ob = st.pop()

                if c == ')' and ob != '(':
                    return False
                if c == '}' and ob != '{':
                    return False
                if c == ']' and ob != '[':
                    return False

        return not st
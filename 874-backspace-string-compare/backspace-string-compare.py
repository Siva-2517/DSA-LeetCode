class Solution:
    def backspaceCompare(self, s, t):
        def build(s):
            st = []

            for ch in s:
                if ch == '#':
                    if st:
                        st.pop()
                else:
                    st.append(ch)

            return ''.join(st)

        return build(s) == build(t)
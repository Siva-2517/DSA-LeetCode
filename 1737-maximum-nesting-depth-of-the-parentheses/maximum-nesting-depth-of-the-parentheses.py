class Solution:
    def maxDepth(self, s: str) -> int:
        ch=0;co=0
        for c in s:
            if c=='(':
                ch+=1
                co=max(ch,co)
            elif c==')':
                ch-=1
        return co
        

class Solution:
    def minInsertions(self, s: str) -> int:
        op=ans=i=0
        while i<len(s):
            if s[i]=='(':
                op+=1
            else:
                if i+1<len(s) and s[i+1]==')':
                    i+=1
                else:
                    ans+=1
                if op==0:
                    ans+=1
                else:
                    op-=1
            i+=1
        return ans+2*op
class Solution:
    def checkValidString(self,s:str)->bool:
        mn=0
        mx=0
        for ch in s:
            if ch=='(':
                mn+=1
                mx+=1
            elif ch==')':
                mn-=1
                mx-=1
            else:
                mn-=1
                mx+=1
            mn=max(0,mn)
            if mx<0:
                return False
        return mn==0
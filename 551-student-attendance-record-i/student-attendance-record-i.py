class Solution:
    def checkRecord(self, s: str) -> bool:
        l=a=0
        for i in s:
            if i=='A':
                a+=1
                if a>=2:
                    return False
            if i=='L':
                l+=1
                if l>=3:
                    return False
            else:
                l=0
        return True
class Solution:
    def numberOfLines(self,widths,s):
        l=1
        w=0
        for c in s:
            x=widths[ord(c)-97]
            if w+x>100:
                l+=1
                w=x
            else:
                w+=x
        return [l,w]
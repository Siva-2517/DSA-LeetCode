class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        s = s.replace("-", "").upper()
        
        ans = []
        count = 0
        
        for i in range(len(s) - 1, -1, -1):
            ans.append(s[i])
            count += 1
            
            if count == k:
                ans.append("-")
                count = 0
        
        return "".join(ans[::-1]).strip("-")
class Solution:
    def smallestPalindrome(self, s: str) -> str:
        par=len(s)//2
        base=sorted(s[:par])
        mid=[s[par]] if len(s)%2==1 else []
        rev=base[::-1]
        return ''.join(base+mid+rev)
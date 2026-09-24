class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        for i,x in enumerate(nums):
            if x<10 and x==i:
                return i
            else:
                tot=0
                while x>0:
                    tot+=x%10
                    x//=10
                if tot==i:
                    return i 
        return -1
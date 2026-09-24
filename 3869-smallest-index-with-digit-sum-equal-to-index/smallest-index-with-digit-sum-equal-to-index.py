class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        for i,x ,in enumerate(nums):
            n=nums[i]
            if n<10 and n==i:
                return i
            else:
                tot=0
                while n>0:
                    tot+=n%10
                    n//=10
                if tot==i:
                    return i 
        return -1
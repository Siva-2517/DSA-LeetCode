class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        e=sum(nums)
        b=0
        for j in nums:
            while j>0:
                b+=j%10
                j//=10
        return abs(e-b) 
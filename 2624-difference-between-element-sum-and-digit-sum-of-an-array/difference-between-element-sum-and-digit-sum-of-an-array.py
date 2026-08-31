class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        return sum(nums) - sum((map(int,''.join(map(str,nums)))))
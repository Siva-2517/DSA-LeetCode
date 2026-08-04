class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        mn=min(nums)
        mx=max(nums)
        return [x for x in range(mn,mx+1) if x not in nums]   



# class Solution:
#     def findMissingElements(self, nums: List[int]) -> List[int]:
#         st = set(nums)
#         mn = min(nums)
#         mx = max(nums)
#         return [x for x in range(mn + 1, mx) if x not in st]
class Solution:
    def maxSubarrayLength(self, nums, k):
        m = {}
        l = 0
        ans = 0

        for r in range(len(nums)):
            m[nums[r]] = m.get(nums[r], 0) + 1

            while m[nums[r]] > k:
                m[nums[l]] -= 1
                l += 1

            ans = max(ans, r - l + 1)

        return ans
class Solution:
    def nextGreatestLetter(self, letters: list[str], target: str) -> str:
        ans = letters[0]
        for ch in letters:
            if ch > target:
                ans = ch
                break
        return ans
class Solution:
    def canConstruct(self, ransomNote, magazine):
        count = [0] * 26
        for c in magazine:
            count[ord(c) - ord('a')] += 1
        for c in ransomNote:
            count[ord(c) - ord('a')] -= 1
            if count[ord(c) - ord('a')] < 0:
                return False
        return True
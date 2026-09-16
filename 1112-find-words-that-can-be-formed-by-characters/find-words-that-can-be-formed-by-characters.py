class Solution:
    def countCharacters(self, words, chars):
        co = [0] * 26
        for c in chars:
            co[ord(c) - ord('a')] += 1
        ans = 0
        for word in words:
            temp = co.copy()
            pos = True
            for c in word:
                i = ord(c) - ord('a')
                temp[i] -= 1
                if temp[i] < 0:
                    pos = False
                    break
            if pos:
                ans += len(word)
        return ans
class Solution:
    def flipAndInvertImage(self, img):
        for r in img:
            r.reverse()
            for i in range(len(r)):
                r[i] ^= 1
        return img
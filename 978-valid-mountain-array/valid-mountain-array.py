class Solution:
    def validMountainArray(self, a):
        i=0
        n=len(a)

        while i+1<n and a[i]<a[i+1]:
            i+=1

        if i==0 or i==n-1:
            return False

        while i+1<n and a[i]>a[i+1]:
            i+=1

        return i==n-1
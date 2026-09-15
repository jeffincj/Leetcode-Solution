class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        n=nm=0
        for i in nums:
            if i ==1:
                n+=1
            else:
                n=0
            nm=max(nm,n)
        return nm   
class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        n=nm=0
        for i in nums:
            if i ==1:
                n+=1
            else:
                nm=max(nm,n)
                n=0
        return max(nm,n)    
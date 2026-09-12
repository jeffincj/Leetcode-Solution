class Solution(object):
    def twoSum(self, nums, target):
        s={}
        for i,n in enumerate(nums):
            d=target-n
            if d in s:
                return [s[d],i]
            s[n]=i
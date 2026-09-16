class Solution(object):
    def twoSum(self, nums, target):
        d={}
        for i in range(len(nums)):
            res=target-nums[i]
            if res in d:
                return [d[res],i]
            d[nums[i]]=i
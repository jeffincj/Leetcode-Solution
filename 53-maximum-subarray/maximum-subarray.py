class Solution(object):
    def maxSubArray(self, nums):
        res=nums[0]
        ps=nums[0]
        for i in range(1,len(nums)):
            ps=max(nums[i],ps+nums[i])
            res=max(res,ps)
        return res
            
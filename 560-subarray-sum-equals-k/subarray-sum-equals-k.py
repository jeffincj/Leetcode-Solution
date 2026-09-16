class Solution(object):
    def subarraySum(self, nums, k):
        res=0
        ps=0
        mp={0:1}

        for i in range(len(nums)):
            ps+=nums[i]
            if ps-k in mp:
                res+=mp.get(ps-k)
            mp[ps]=mp.get(ps,0)+1
        return res
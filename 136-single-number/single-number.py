class Solution(object):
    def singleNumber(self, nums):
        res= defaultdict(int)
        for i in nums:
            res[i]=res.get(i,0)+1
        for i in res.keys():
            if res[i]==1:
                return i
        
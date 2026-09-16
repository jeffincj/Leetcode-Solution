from collections import Counter
class Solution(object):
    def majorityElement(self, nums):
        d=Counter(nums)
        res=0
        p=0
        for i in d:
            if res<d[i]:
                p=i
                res=d[i]
               
        return p
        
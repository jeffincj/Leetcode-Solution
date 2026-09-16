class Solution(object):
    def majorityElement(self, nums):
        can=nums[0]
        c=1
        for i in nums[1:]:
            if can==i:
                c+=1
            else:
                c-=1
            if c==0:
                can=i
                c=1
        return can       
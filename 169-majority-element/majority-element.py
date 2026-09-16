class Solution(object):
    def majorityElement(self, nums):
        can=nums[0]
        c=1
        for i in range(1,len(nums)):
            if can==nums[i]:
                c+=1
            else:
                c-=1
            if c==0:
                can=nums[i]
                c=1
        return can       
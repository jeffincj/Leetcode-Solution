class NumArray(object):

    def __init__(self, nums):
        self.nums=nums
        self.pnums=[]
        s=0
        for n in nums:
            s+=n
            self.pnums.append(s)
        
        

    def sumRange(self, left, right):
        if left ==0:
            return self.pnums[right]
        return self.pnums[right]-self.pnums[left-1]
        
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
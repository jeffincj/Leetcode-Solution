class NumArray(object):

    def __init__(self, nums):
        self.pnums=[0]
        s=0
        for n in nums:
            s+=n
            self.pnums.append(s)
        
        

    def sumRange(self, left, right):
        return self.pnums[right+1]-self.pnums[left]
        
        


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
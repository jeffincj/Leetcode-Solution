class Solution(object):
    def thirdMax(self, nums):
        mx1=float('-inf')
        mx2=float('-inf')
        mx3=float('-inf')
        for n in nums:
            if mx1<n:
                mx3=mx2
                mx2=mx1
                mx1=n
            elif n!=mx1 and n>mx2:
                mx3=mx2
                mx2=n
            elif n!=mx1 and n!=mx2 and n>mx3:
                mx3=n
        if mx3==float('-inf'):
            if mx1==float('-inf'):
                return -1
            return mx1
        return mx3
class Solution(object):
    def reverse(self, x):

        if x<0: sign=-1
        else: sign=1
        x=abs(x)
        s=0
        while x:
            d=x%10
            s=s*10+d
            x//=10
        if -2**31 <= s <= 2**31 - 1:
            return sign*s
        return 0

        
class Solution(object):
    def reverse(self, x):

        if x<0: sign=-1
        else: sign=1
        x=abs(x)
        s=0
        c=0
        while x!=0:
            c+=1
            d=x%10
            s=s*10+d
            x//=10
        if s<2**31:
            return sign*s
        return 0

        
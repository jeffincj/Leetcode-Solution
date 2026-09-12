class Solution(object):
    def countDigits(self, num):
        c=0
        s=num
        while s!=0:
            d=s%10
            if num%d==0:
                c+=1
            s/=10
        return c

        
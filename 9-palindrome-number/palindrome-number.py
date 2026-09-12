class Solution(object):
    def isPalindrome(self, x):
        if x<0:
            return False
        sam=x
        rev=0
        while sam:
            d=sam%10
            rev=rev*10+d
            sam//=10
        return rev==x
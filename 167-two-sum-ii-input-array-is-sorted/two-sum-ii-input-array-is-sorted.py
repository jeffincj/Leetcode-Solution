class Solution(object):
    def twoSum(self, numbers, target):
        mp={}
        ps=0
        for i in range(len(numbers)):
            s=target-numbers[i]
            if s in mp:
                return mp[s]+1,i+1
            mp[numbers[i]]=i
        return -1
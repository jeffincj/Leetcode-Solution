class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int ps=nums[0];
        for (int i=1;i<nums.length;i++){
            ps=Math.max(nums[i],ps+nums[i]);
            res=Math.max(res,ps);
        }
        return res;
    }
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int s=0;
        int mlen=Integer.MAX_VALUE;
        while(r<nums.length){
            s+=nums[r];
            while(s>=target){
                mlen=Math.min(mlen,r-l+1);
                s-=nums[l];
                l++;
            }
            r++;
        }
        return mlen==Integer.MAX_VALUE?0:mlen;
    }
}
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int v=0;
        int r=height.length-1;
        while(l<r){
            int area=(r-l) * Math.min(height[l],height[r]);
            v=Math.max(v,area);
            if (height[l]<height[r])l++;
            else r--;
        }
        return v;
    }
}
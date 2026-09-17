class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int best=0;
        for(int r=1;r<prices.length;r++){
            if (prices[l]>prices[r]){
                l=r;
                continue;
            }
            best=Math.max(best,prices[r]-prices[l]);
        }
        return best;
    }
}
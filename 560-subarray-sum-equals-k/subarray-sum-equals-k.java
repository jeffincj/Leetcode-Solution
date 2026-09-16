class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Long,Integer> mp=new HashMap<>();
        mp.put(0L,1);
        int res=0;
        long ps=0;
        for (int n:nums){
            ps+=n;
            if (mp.containsKey(ps-k)) res+=mp.get(ps-k);
            mp.put(ps,mp.getOrDefault(ps,0)+1);
        }
        return res;
    }
}
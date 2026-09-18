class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] last = new int[128];
        int l = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            if (last[c] > l) {
                l = last[c];
            }

            last[c] = r + 1;

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
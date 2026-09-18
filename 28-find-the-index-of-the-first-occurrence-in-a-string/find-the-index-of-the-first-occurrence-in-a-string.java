class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int r=0;
        while (l<haystack.length()){
            if (haystack.charAt(l)==needle.charAt(r)){
                l++;
                r++;
                if (r==needle.length())return l-r;
            }
            else{
                l=l-r+1;
                r=0;
            }
        }
        return -1;
    }
}
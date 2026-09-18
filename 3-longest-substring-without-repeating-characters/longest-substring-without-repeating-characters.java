class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        String subs="";
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(subs.indexOf(c)==-1)subs+=c;
            else{
                res=Math.max(res,subs.length());
                subs+=c;
                int l=subs.indexOf(c);
                subs=subs.substring(l+1,subs.length());
            }
        }
        return Math.max(res,subs.length());
    }
}
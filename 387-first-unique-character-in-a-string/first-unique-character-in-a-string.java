class Solution {
    public int firstUniqChar(String s) {
        int []co=new int[26];
        for (char c:s.toCharArray()){
            co[c-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(co[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
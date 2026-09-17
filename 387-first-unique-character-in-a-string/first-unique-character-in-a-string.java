class Solution {
    public int firstUniqChar(String s) {
        int []co=new int[26];
        for (char c:s.toCharArray()){
            co[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if (co[c-'a']==1)return s.indexOf(c);
        }
        return -1;
    }
}
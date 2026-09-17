class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>f=new HashMap<>();
        for (char c:s.toCharArray()){
            f.put(c,f.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if (f.get(c)==1)return s.indexOf(c);
        }
        return -1;
    }
}
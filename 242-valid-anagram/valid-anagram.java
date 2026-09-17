class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer>d=new HashMap<>();
        for(char c :s.toCharArray()){
            d.put(c,d.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if (!d.containsKey(c)) return false;
            else if (d.get(c)==1)d.remove(c);
            else d.put(c,d.get(c)-1);
        }
        if (!d.isEmpty()) return false;
        return true;
    }
}
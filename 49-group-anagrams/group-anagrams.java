class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map=new HashMap<>();
        for(String w:strs){
            char[]c=w.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(w);
        }
        return new ArrayList<>(map.values());
    }
}
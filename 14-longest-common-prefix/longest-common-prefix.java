class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pr="";
        for(char c:strs[0].toCharArray()){
            pr+=c;
            for (int j=1;j<strs.length;j++){
                if (!strs[j].startsWith(pr)){
                    return pr.substring(0, pr.length() - 1);
                }
            }
        }
        return pr;
    }
}

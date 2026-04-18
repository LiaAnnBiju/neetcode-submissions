class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String result ="";
        char[] s = strs[0].toCharArray();
        for(int j =0; j< s.length; j++){
            for(int i=1; i<strs.length; i++){
                if(j >= strs[i].length() || s[j] != strs[i].charAt(j)){
                    return result;
                }
            }
            result = result + s[j];
        
        }
        return result;
        
    }
}
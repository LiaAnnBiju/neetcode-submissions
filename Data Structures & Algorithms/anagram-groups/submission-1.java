class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
    return new ArrayList<>();
}
        List<String> s = new ArrayList<>();
        HashMap<String,List<String>> sortedString = new HashMap<>();
        for(int i=0; i< strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String p = new String(c);
            if (!sortedString.containsKey(p)) {
                sortedString.put(p, new ArrayList<>());
            } 
                sortedString.get(p).add(strs[i]);
            
        }
      return new ArrayList<>(sortedString.values());
      
    }
}

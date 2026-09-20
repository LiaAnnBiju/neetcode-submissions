class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> c = new HashMap<>();
        for( char a : s.toCharArray()){
            c.put(a,c.getOrDefault(a,0)+1);
        }

        for(char b : t.toCharArray()) {
            if (!c.containsKey(b)) {
                return false;
            }
            c.put(b, c.get(b) - 1);
            
            if(c.get(b) ==0){
                c.remove(b);
            }
        }
        return c.isEmpty();
    }
}
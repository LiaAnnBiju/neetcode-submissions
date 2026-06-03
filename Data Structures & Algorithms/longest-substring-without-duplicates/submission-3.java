class Solution {
    public int lengthOfLongestSubstring(String s) {
        int k =0;
        int limit =0;
        int left =0 ;
        Set<Character> p = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (p.contains(s.charAt(i))){
             
            while (p.contains(s.charAt(i))) {
                p.remove(s.charAt(left));
                left++;
            }
            p.add(s.charAt(i));
            k = p.size();

    }
            else{
                p.add(s.charAt(i));
            k++;

        }

        if (k >= limit) {
            limit = k;
        }
    

        }
        return limit;
    }
}

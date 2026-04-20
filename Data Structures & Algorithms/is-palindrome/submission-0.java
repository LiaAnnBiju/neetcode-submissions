class Solution {
    public boolean isPalindrome(String s) {
       String r =s.replaceAll("[^a-zA-z0-9]","");
        char[] m = r.toCharArray();
        System.out.println(Arrays.toString(m));
        int left = 0;
        int right = m.length -1;

        while (left<right){
            if(Character.toLowerCase(m[left])!= Character.toLowerCase(m[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

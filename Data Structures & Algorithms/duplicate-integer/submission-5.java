class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numb = new HashSet<>();
        
        for(int i =0; i< nums.length; i++){
            if(!numb.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
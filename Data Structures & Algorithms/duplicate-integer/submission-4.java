class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numb = new HashSet<>();
        
        for(int i =0; i< nums.length; i++){
            if(numb.contains(nums[i])){
                return true;
            }
            numb.add(nums[i]);
        }
        return false;
    }
}
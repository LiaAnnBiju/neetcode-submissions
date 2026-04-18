class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet s = new HashSet();
        for(int i=0; i< nums.length; i++){
            if (!s.contains(nums[i])) {
                s.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
         int left =0;
        Set<Integer> b = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if (i - left > k){
                 b.remove(nums[left]);
                 left++; 

            }
            if(!b.contains(nums[i])){
                b.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
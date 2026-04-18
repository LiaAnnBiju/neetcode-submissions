class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> occurance  = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(occurance.getOrDefault(nums[i],0) >= nums.length/2 ){
                return nums[i];            
            }
            occurance.put(nums[i],occurance.getOrDefault(nums[i],0)+1);
        }
        return 0;
    }
}
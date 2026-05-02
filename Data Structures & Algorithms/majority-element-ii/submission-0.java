class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> occ = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i =0; i< nums.length; i++){
            if(occ.getOrDefault(nums[i],0)>=nums.length/3 & !result.contains(nums[i] )){
                result.add(nums[i]);
                continue;
            }
            occ.put(nums[i],occ.getOrDefault(nums[i],0)+1);
        }
        return result;
    }
}
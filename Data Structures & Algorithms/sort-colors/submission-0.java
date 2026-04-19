class Solution {
    public void sortColors(int[] nums) {
        for(int i =0; i< nums.length; i++){
                int minIndex = i;
            for (int j =i ; j<nums.length; j++){
                if(nums[j]< nums[minIndex]){
                    minIndex =j;
                }
            }
            if(nums[i]>nums[minIndex]){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }
}
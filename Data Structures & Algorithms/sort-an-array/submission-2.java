class Solution {
    public int[] sortArray(int[] nums) {
       for(int i=0; i< nums.length; i++){
            int minIndex= i;
            for (int j=i; j< nums.length; j++){
                if(nums[j]< nums[minIndex]){
                    minIndex=j;
                }
            }
            if(nums[minIndex] < nums[i]){
                int temp= nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] =temp;

            }
        }
        return nums;
    } 
    }

class Solution {
    public int[] sortArray(int[] nums) {
       for(int i=0; i< nums.length; i++){
            int min = nums[i];
            int minIndex=0;
            for (int j=i; j< nums.length; j++){
                if(nums[j]< min){
                    min = nums[j];
                    minIndex=j;
                }
            }
            if(min < nums[i]){
                int temp= nums[i];
                nums[i] = min;
                nums[minIndex] =temp;

            }
        }
        return nums;
    } 
    }

class Solution {
        public int maxArea(int[] height) {
                int area =0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int temp =0;
            if(height[left]< height[right]){
                temp = height[left]*(right-left);
                left++;
            }
            else{
                temp = height[right]*(right-left);
                right--;
            }
            if(temp>area){
                area = temp;
            }
        } 
                                                                        return area;                                                                                                                                           }  
}                                                                                                                                                                                         
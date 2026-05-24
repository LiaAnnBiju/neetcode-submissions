class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int temp =0 ;
                if(height[i] > height[j]){
                    temp = height[j] * (j-i);
                }
                else{
                    temp = height[i] * (j-i);
                }
                if(temp> area){
                    area = temp;
                }
    }
}
        return area;
    }
}
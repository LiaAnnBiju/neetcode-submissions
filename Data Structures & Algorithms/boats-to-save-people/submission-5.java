class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length -1;
        int count =0 ;
        int[] s =Arrays.stream(people).sorted().toArray();

        while(left<right){
        if(s[left] + s[right] <= limit){
                left ++;
            }
            right--;
            count ++;
        }
        if(left == right){
            count++;
        }
        return count;
    }
}
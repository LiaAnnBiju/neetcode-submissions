class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length -1;
        int count =0 ;
        int[] s =Arrays.stream(people).sorted().toArray();

        while(left<right){
            if(s[left] == limit){
                count ++;
                left ++;
            }
            if(s[right] == limit){
                count ++;
                right--;
            }
            else if(s[right]+s[left] == limit){
                count++;
                left++;
                right--;
            }
            else if(s[right]+s[left] > limit){
                count++;
                right--;
            }
            else {
                count++;
                left++;
                right--;
            }
        }
        if(left == right){
            count++;
        }

        return count;
    }
}
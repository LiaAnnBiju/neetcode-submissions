class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] a = Arrays.stream(nums).sorted().toArray();
            Set<List<Integer>> ni = new HashSet<>();
            int k =a.length;
        for(int i =0;i< k; i++){
                int left = i+1;
                int right = k-1;
                while(left< right){
                    int sum = a[left] + a[right];
                    if(sum == -a[i]){
                        ni.add(List.of(a[i],a[left],a[right]));
                        left++;
                        right--;
                    }
                    else if(sum< -a[i]){
                        left++;
                    }
                    else if(sum> -a[i]){
                        right--;
                    }


                }

            }
            return ni.stream().toList();
    }
    
}

package Array;

import java.util.HashSet;

class SubarraysWithKDistinct {
    static void main() {
        int[] nums = {2,1,1,1,2};
                int k =1;
      int ans =  subarraysWithKDistinct(nums, k);
        System.out.println(ans);
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int subarray =0;
        for(int i =0; i<nums.length; i++){
            HashSet<Integer> set = new HashSet<Integer>();
            int count =0;
            for(int j =i; j<nums.length; j++){
                if((!set.contains(nums[j])) && count<k){
                    set.add(nums[j]);
                    count++;
                }
                if(set.contains(nums[j]) && count == k){
                    subarray++;
                }
            }
        }
        return subarray;
    }
}
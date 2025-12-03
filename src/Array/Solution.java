package Array;

import java.util.HashSet;

class Solution {
    static void main() {
        int[] nums = {3,1,4,2};
      int ans =  minSubarray(nums,6);
        System.out.println(ans);
    }
    public static int minSubarray(int[] nums, int p) {
        int n  = nums.length;
        HashSet<Long> set = new HashSet<Long>();
         long sum =0;
         for(int i=0; i<n; i++){
            sum += nums[i];
            set.add((long)nums[i]);
         }
         long rem = sum%p;
          if(rem == 0) return 0;

        if(set.contains(rem)){
            return 1;
        }
//        for (int i = 0; i < n; i++) {
//            if(nums[i] == rem) return 1;
//        }

          
          for(int i =0; i<n-1; i++){
            int len = 0;
            int sum1 = 0;
             for(int j =i; j<n; j++){

                   sum1 += nums[j];
                   len++;
                 if((i==0) && (j==n-1)){
                     if(sum1 == rem) return -1;
                 }
                   if(sum1 == rem){
                         return len;
                   }
             }
          }
          return -1;
    }
}
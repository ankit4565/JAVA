package Array;

public class MaximumSubarrayDivisibleBy_k {
    static void main() {
        int[] nums = {-5,1,2,-3,4};
        int k = 2;
       long ans =  maxSubarraySum(nums,k);
        System.out.println(ans);
    }

        public static long maxSubarraySum(int[] nums, int k) {
            int n = nums.length;
            long count = 0;
            long max = Integer.MIN_VALUE;
            int left = 0;
            int right = 0;
            while(right < n){
                count += nums[right];

             if( ((right-left+1)%k == 0 )){
                    max = Math.max(count, max);
//                    if(count >= 0) {
                        count -= nums[left];
//                    }else{
//                        count += nums[left];
//                    }
                    left++;
                }
                right++;
            }

            return max;
        }

}

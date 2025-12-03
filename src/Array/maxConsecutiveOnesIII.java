package Array;

class maxConsecutiveOnesIII {
    static void main() {
        int[] nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
       int ans= longestOnes(nums,3);
        System.out.println(ans);
    }
    public static int longestOnes(int[] nums, int k) {
        int maxlen = 0;

        int left =0;
        int right =0;
        int zeroes =0;
        while(right<nums.length){
            if(zeroes<k){

            }
             if(nums[right] == 0){

                 zeroes++;

             }
             while(zeroes>k) {
                 if(nums[left] == 0) {
                     zeroes--;

                 }
                 left++;
             }
            maxlen = Math.max(maxlen, right-left+1);
             right++;

        }


        return maxlen;
    }
}
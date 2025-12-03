package Array;

import java.util.Arrays;

class RerrangeArray {
    static void main() {
        int[] nums = {-1,1};
      int[] ans  = rearrangeArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos  = new int[n/2];
        int[] neg = new int[n/2];
          int i = 0;
          int j = 0;
         for(int a : nums){
             if(a>0){
                pos[i] = a;
                i++;
             }else{
                neg[j]  = a;
                j++;
             }
         }
            int c = 0; 
            int d =0;
            int k = 0;
            while(c<pos.length || d<neg.length){
                  if(k%2 ==0){
                    nums[k] = pos[c];
                    c++;
                    k++;
                  }else{
                      nums[k] = neg[d];
                      d++;
                      k++;
                  }
            }
          return nums;
    }
}
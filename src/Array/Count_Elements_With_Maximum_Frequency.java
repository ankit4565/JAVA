package Array;

import java.util.Arrays;

class Count_Elements_With_Maximum_Frequency {
    static void main() {
//        int[] arr = {10,12,11,9,6,19,11};
        int[] arr = {1,5,2,4,2,6,2,2};
        maxFrequencyElements(arr);
    }
    public static void maxFrequencyElements(int[] nums) {
        int max = 0;
        for(int num : nums){
          max = Math.max(num, max);
        }

        int[] arr = new int[max+1];
        for(int i =0; i<nums.length;  i++){
            arr[nums[i]] = arr[nums[i]]+1;
        }

        System.out.println(Arrays.toString(arr));
            int freq = 0;
            int max1=arr[0];
            for(int j = 1; j<arr.length; j++){
                if(arr[j]==max1){
                    freq++;

                }else if(arr[j]>max1){
                    max1 = arr[j];
                    freq=1;
                }
             //   max1 = Math.max(max1, arr[j]);

            }
        System.out.println(max1);
        System.out.println(freq*max1);


    }
}
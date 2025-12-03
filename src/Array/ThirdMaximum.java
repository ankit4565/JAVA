package Array;

import java.util.*;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] nums = {1,2,2,5,3,5};
        System.out.println(thirdMax(nums));
    }

        public static int thirdMax(int[] nums) {
            int n = nums.length;
            int thirdMax = Integer.MAX_VALUE;
            HashSet<Integer> set = new HashSet<>();
            for(int i =0; i<n; i++){
                set.add(nums[i]);
            }

            int[] arr = new int[set.size()];
            int index=0;
            for(int j : set){
                arr[index++] = j;
            }
            Arrays.sort(arr);
            if(arr.length<3) return arr[arr.length-1];
            int count = 0;
            for(int i =arr.length-1; i>=0; i--){
                if(arr[i]<thirdMax){

                    thirdMax = arr[i];
                    count++;
                   if(count ==3){
                       return thirdMax;
                   }

                }
            }
            return thirdMax;
        }
    }


package Array;

import java.util.Arrays;

class maxFreq {
    static void main() {
        int[] nums = {1,2,4};

        System.out.println( maxFrequency(nums,5));
    }
    public static int maxFrequency(int[] nums, int k) {

                Arrays.sort(nums);
                int n = nums.length;
                int maxfreq = 0;


                for (int i = n - 1; i > 0; i--) {
                    int j = i - 1;
                    int operation  =k;
                    int countfreq = 0;
                    while (j >= 0) {
                        operation = operation - (nums[i] - nums[j]);
                        if(operation<=k && operation>=0){
                            countfreq++;
                        }


                        if (operation <= 0) {
                            break;
                        }
                        j--;
                    }
                    maxfreq = Math.max(maxfreq, countfreq);
                }
                return maxfreq;
            }
        }

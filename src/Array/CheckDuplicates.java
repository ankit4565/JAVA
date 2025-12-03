package Array;

import java.util.Arrays;

public class CheckDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = nums.length;
        int n = 3;
        System.out.println(containsNearbyDuplicate(nums,k,n));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k,int n) {

        for( int i=0; i<k; i++){
            int val = nums[i];
            for(int j=i+1; j<k; j++){
                if(nums[i]== nums[j] && Math.abs(i-j)<=n){
                    // if(){
                    return true;
                    // }
                }
            }
        }
        return false;
    }
}

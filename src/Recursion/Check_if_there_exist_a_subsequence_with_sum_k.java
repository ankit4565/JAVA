package Recursion;

public class Check_if_there_exist_a_subsequence_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {9,5,6};
        int k = 2;
        System.out.println(checkSubsequenceExist(0,arr,0, k, arr.length));
    }
    public static int checkSubsequenceExist(int i, int[] arr, int sum , int k , int n){
        if(i ==n){
            if(sum ==k ){
                return 1;
            }
           else  return 0;
        }

       if(checkSubsequenceExist(i+1,arr,sum+arr[i], k, n) == 1){
           return 1;
       }

        if(checkSubsequenceExist(i+1,arr,sum, k, n) == 1) {
            return 1;
        }



        return 0;
    }
}

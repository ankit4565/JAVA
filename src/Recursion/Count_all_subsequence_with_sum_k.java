package Recursion;

public class Count_all_subsequence_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {4,9,2,5,1};
        int k = 10;
        int n = arr.length;
        System.out.println(subsequences(0, 0, k, arr, n));
    }

    public static int subsequences(int i, int sum, int k, int[] arr, int n) {
        if (i == n) {
            if(sum == k){
                return 1;
            }
            return 0;
        }


        int include = subsequences(i + 1, sum+arr[i], k, arr, n);


        int exclude = subsequences(i + 1, sum, k, arr, n);

        return include + exclude;
    }
}

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_all_subsequence_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<Integer>();
        subsequences(0, list, 0, k, arr, n);
    }

    public static void subsequences(int i, ArrayList<Integer> list, int sum, int k, int[] arr, int n){

        if(i == n){
            if(sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        sum+= arr[i];
        subsequences(i+1, list, sum, k,  arr, n);

        list.removeLast();

        sum-= arr[i];
        subsequences(i+1, list, sum, k,  arr, n);
    }

}

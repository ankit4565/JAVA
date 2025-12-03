package Recursion;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sum_of_all_Subset_I {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int n = arr.length;
                 // subsets = [ [],[5],[2],[1],[5,2],[5,1],[2,1],[5,2,1] ]
        // sum of all subsets = [ 0,  5,  2,  1,   7,   6,     3,    8]
        // output should be =   [ 0, 1, 2, 3, 5, 6, 7, 8 ]

//        List<Integer> res = new ArrayList<>();
//        sumOfAllSubsets(0, 0,arr, res, n); // calculating sum of all subset
//        Collections.sort(res);    // Arranging in increasing order
//        System.out.println(res);
        List<Integer> res = new ArrayList<>();
        sumOfAllSubset(0,arr,0,res,n);
        Collections.sort(res);
        System.out.println(res);
    }

//    public static void sumOfAllSubsets(int i, int sum , int[] arr, List<Integer> res , int n){
//
//        if(i==n){
//            res.add(sum);
//            return;
//        }
//
//
//
////        sum+=arr[i];
//        sumOfAllSubsets(i+1, sum+arr[i], arr, res, n);  //In recursion call it gets own copy of sum so we don't need to subtract last added value from the sum variable
//
//
////         sum-=arr[i];
//        sumOfAllSubsets(i+1, sum,arr, res, n);


    public static void sumOfAllSubset(int i, int[] arr, int sum , List<Integer> res, int n){

        if(i==n){
            res.add(sum);
            return;
        }



        sumOfAllSubset(i+1, arr,sum+arr[i],res,n);


        sumOfAllSubset(i+1, arr,sum,res,n);
    }
}

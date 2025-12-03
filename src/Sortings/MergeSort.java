package Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 34, 56, 76, 45, 32, 45, 98, 67, 4, 6, 3, 0};
        int n = arr.length-1;
        mergeSortAlgo(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
        public static void merge(int[] arr, int left , int mid, int right ){
           int n1= mid-left+1;
           int n2= right-mid;

             int[] L = new int[n1];
             int[] R = new int[n2];

             for(int i=0; i<n1; i++){
                 L[i] = arr[left+i];

             }
           // System.out.println(Arrays.toString(arr));
            for(int i=0; i<n2; i++){
                R[i] = arr[mid+1+i];
            }

            int i = 0, j =0;
            int k = left;

            while(i<n1 && j<n2){
                if(L[i]<=R[j]){
                    arr[k] = L[i];
                    i++;
                    k++;

                } else{
                    arr[k] = R[j];
                    j++;
                    k++;

                }

            }

            while(i<n1){
                arr[k] = L[i];
                k++;
                i++;
            }
            while(j<n2){
                arr[k] = R[j];
                k++;
                j++;
            }


        }


        public static void mergeSortAlgo(int[] arr, int left, int right){

        if(left<right){
            int mid = left + (right-left)/2;

            mergeSortAlgo(arr,left,mid);
            mergeSortAlgo(arr, mid+1, right);
            merge(arr,left,mid,right);
        }

    }


}

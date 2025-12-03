package Sortings;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,7,8,9,1,5};
        int n = arr.length;
        int l = 0; int h = n-1;
        quickSortAlgo(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public  static int partition(int[] arr,int low, int high){
                int pivot = arr[high];
                int i = low-1;
        for (int j = low; j < high; j++) {
            if(arr[j]<pivot){
                i++;
                swap(arr,i, j);
            }
        }
     i++;
        swap(arr,i,high);
        return i ;
    }

    public static   void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
         arr[j] = temp;
    }

 public static void quickSortAlgo(int[] arr, int low, int high){
        if(low<high){
             int pivotindex = partition(arr, low, high);
             quickSortAlgo(arr,low,pivotindex-1);
             quickSortAlgo(arr,pivotindex+1,high);
        }
 }
}

package Sortings;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr= {85,22,49,97,86,15};
        int n = arr.length;

        System.out.println(Arrays.toString(insertionSortAlgo(arr,n)) );
        System.out.println(Arrays.toString(arr));
    }

          public static int[] insertionSortAlgo(int[] arr, int  n){

       // int[] arr = new int[n];
              for (int i = 0; i < n; i++) {
                  arr[i] = arr[i];
              }
              for (int i = 1; i <n; i++) {
                  int key = arr[i];
                  int j = i-1;
                 // int k = i;
                  while(j>=0 && arr[j] > key){
                      arr[j+1] = arr[j];

                      j--;
//                      k--;
                      arr[j+1] = key;
                  }


              }
              return new int[]{2,4};
          }

}

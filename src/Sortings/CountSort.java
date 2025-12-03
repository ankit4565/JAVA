package Sortings;


import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4,3,1,3,2,5,2,8,10};
        int n = arr.length;
        countSortAlgo(arr,n);
    }
     public static void countSortAlgo(int[] arr, int n){
        int largest = arr[0];
        for(int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
         //   System.out.println(largest);
            int[] temp = new int[largest + 1];

            for(int j =0; j<n; j++){
                temp[arr[j]] =  temp[arr[j]]+1;
            }
        System.out.println(Arrays.toString(temp));
              int index = 0;
            for (int j = 0; j < temp.length; j++) {
                while (temp[j] > 0) {
                    arr[index] = j;
                    temp[j]--;
                    index++;
                }
            }
         System.out.println(Arrays.toString(arr));
            }
        }




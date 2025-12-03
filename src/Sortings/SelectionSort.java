package Sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {60,60 , 40} ;
        int n = arr.length;
       SelectionSort obj = new SelectionSort();
         obj.selectionAlgo(arr,n);
       // new SelectionSort().selectionAlgo(arr,n);
        System.out.println(Arrays.toString(arr));

    }


    public static void selectionAlgo(int[] arr, int n) {

        for (int i = 0; i < n- 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }

}


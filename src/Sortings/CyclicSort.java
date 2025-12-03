package Sortings;

import java.util.Arrays;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,8,1};
        cyclicSortAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSortAlgo(int[] arr){
         int i =0;
        while(i<arr.length) {
            int valIndex = arr[i]-1;
            if(arr[i] != arr[valIndex]){
               swap(arr, i,valIndex);
            }else{
                i++;
            }

        }
    }

    public static void swap(int[] arr, int i , int valIndex){
        int temp = arr[i];
         arr[i] = arr[valIndex];
         arr[valIndex] = temp;
    }
}

package Sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10500, 1110, 98, 55, 78, 75};
        int n = arr.length;
       // bubbleSort(arr, n);
        recursiveBubbleAlgo(arr,n);
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr, int n){

        for(int i=0; i<n-1; i++){
            int flag = 0;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                      arr[j+1] = temp;
                     flag = 1;
                }

            }
            if(flag==0){
                break;
            }
        }
    }


    public static void recursiveBubbleAlgo(int[] arr, int n){
     if(n==1){
         return;
     }

  int flag =0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = temp;
    flag +=1;
            }
            if(flag==0){
                 return;
            }
            recursiveBubbleAlgo(arr,n-1);
        }

    }
}
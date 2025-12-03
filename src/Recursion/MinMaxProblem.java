package Recursion;

import java.util.Arrays;

public class MinMaxProblem {
    public static void main(String[] args) {
            int[] arr = {3, 56, 78, 34, 2, 34, 32, 56, 98, 67, 199};

//        int[] arr = new int[]{4,2};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = arr.length - 1;
        int[] res =     minMax(arr,i,j ,min,max);
        System.out.println(Arrays.toString(res));

    }

    static int[] minMax(int[] arr, int i, int j, int min, int max) {
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        if(i==j){
            min = arr[i];
            max = arr[j];
            return new int[]{min, max};
        }

        else if(i ==j-1 ){
                           if(arr[i]>arr[j]){
                               max = arr[i];
                               min = arr[j];
                           } else {
                               max = arr[j];
                               min = arr[i];
                           }
                 return new int[]{min, max};

        }
        else {
            int min1 =  Integer.MAX_VALUE;
            int max1 = Integer.MIN_VALUE;
            int mid = i+(j-i)/2;
         int[] left =   minMax(arr,i, mid, min, max);
         int[] right =   minMax(arr,mid+1,j,min1,max1);
           min =   Math.min(left[0], right[0]);
           max = Math.max(left[1],right[1]);

           return new int[]{min,max};
        }

    }
}
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Max Value: " +         max    +   " &" + " Min vlaue:" + min);
//    }


 //   public static int[] MinMax(int[] arr,int i, int j, int min, int max){
//
//
//        if(i==0 && j==0 ){
//           return new int[]{-1};
//        }
//        if(i==j){
//           min = arr[i];
//           max = arr[i];
//           return new int[]{min, max};
//
//        } else if(j-i == 1){
//                         if(arr[i]>arr[j]){
//                                     min = arr[j];
//                                     max = arr[i];
//                         } else {
//                              max = arr[j];
//                              min = arr[i];
//                         }
//                         return new int[]{ min, max};
//        }
//        else{
//              int mid = (i+j)/2;
//            int min1 = Integer.MAX_VALUE;
//            int max1 = Integer.MIN_VALUE;
//          int[] arr1 =  MinMax( arr, i ,mid, min, max);
//          int[]  arr2 = MinMax(arr,mid+1,j,min1,max1);
//
//          min = Math.min(arr1[0],arr2[0]);
//          max = Math.max(arr[1], arr2[1]);
//                return new int[]{min, max};
//        }
//
//    }
//}

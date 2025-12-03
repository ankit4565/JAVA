package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensionalarray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
        int[][] arr = {{2,4,9,0,5,4}, {4,5,7,8}};
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

//        for (int[] i : arr){
//            System.out.println(Arrays.toString(i));
//        }
    }
}

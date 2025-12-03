package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class basic {

    public  int[] table(int n) {

        int[] arr = new int[11];
        for (int i = 1; i < 10; i++) {
            arr[i] = n * i;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        basic obj = new basic();
        int[] arr = obj.table(n);
        System.out.println(Arrays.toString(arr));
    }

}


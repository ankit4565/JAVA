package Basics;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a*b);
        for (int i = 1; i <10000; i++) {
            System.out.println(a*i);
        }
    }
}

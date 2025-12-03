package Array;

import java.util.Arrays;
import java.util.Scanner;



public class Array {
    public static void main(String[] args) {
     int[] arr = new int[]{2,3};
//                {1, 2,4},
//                {3, 4,6},
//                {6, 8}
      //  };
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char ch = sc.next().charAt(0);

        char temp = 'a';
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                if(j == c-3){
                   temp = ch;
                }
                if(j==0){
                   ch = temp;
                }
                System.out.print(ch++ +" ");
            }

            System.out.println();
        }
    }
}


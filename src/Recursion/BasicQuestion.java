package Recursion;

public class BasicQuestion {
    public static void main(String[] args) {

        // factorial  5! = 5*4*3*2*1
        // int ans = factorial(n);
        // System.out.println(ans);

//        static int factorial ( int n ){
//
//            if (n == 1) {
//                return n;
//            }
//            return n * factorial(n - 1);
//        }

    int n=6;
    int ans = fibonacci(n);
        System.out.println(ans);
    }

        // fibonacci sequence
        //     1  2 3 4 5 6 7 8 9
        //  0 ,1,1,2,3,5,8,13,21
     static  int fibonacci(int n){
       if(n<2){
           return n;
       }

        return fibonacci(n-1)+ fibonacci(n-2);

     }
}

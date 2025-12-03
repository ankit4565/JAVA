package Array;

import java.util.HashSet;

public class Happy_Number {
    static void main() {
        int n = 19;
        HashSet<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n =  helper(n);

        }
        System.out.println(n ==1 ? 1:0);
    }
    public static int helper(int n ){
        int rem = 0;
        while(n>0){
           int re = n%10;
            rem += re*re;
          n /= 10;
        }

        return rem;
    }
}

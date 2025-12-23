package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrderInAnotherStack {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the number of elements you want to insert : ");
        n = sc.nextInt();
        System.out.println("Enter the element : ");
        for (int i = 1; i <=n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        // reverse order
         Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());

        }
        // for same order
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}

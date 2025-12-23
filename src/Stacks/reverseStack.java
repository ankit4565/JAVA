package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class reverseStack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        //Iterative approach
//         int n = st.size();
//        int[] arr = new int[n];
//        int i =0;
//        while(st.size()>0){
//            arr[i] = st.pop();
//            i++;
//        }
//        i=0;
//        while(i<arr.length){
//            st.push(arr[i]);
//            i++;
//        }
//
//        System.out.println(st);

        //Recursive approach
          reverse(st);
        System.out.println(st);
    }

    public static void reverse(Stack<Integer> st){

        if(st.size()== 1 || st.size() == 0) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(top, st);

    }
    public static void pushAtBottom(int top , Stack<Integer> st){
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        st.push(top);
        while(gt.size()>0){
            st.push(gt.pop());
        }

    }
}

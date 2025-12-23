package Stacks;

import java.util.Stack;

public class printFrombottomToTop {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
 // with another stack
//        Stack<Integer> gt = new Stack<>();
//        while(st.size()>0){
//            gt.push(st.pop());
//        }
//        while(gt.size()>0){
//            int x = gt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

//// with the array
//        int n = st.size();
//        int[] arr = new int[n];
//        int j = n-1;
//        while(st.size()>0){
//            arr[j] = st.pop();
//            j--;
//        }
//        for (int i = 0; i <n ; i++) {
//            int x = arr[i];
//            System.out.println(x);
//            st.push(x);
//        }

        displayRevRec(st);

    }
    public static void displayRevRec(Stack<Integer> st){
        if(st.size() == 0) {
            System.out.println();
            return;
        }
        int top = st.pop();
        System.out.print(top+ " ");
        displayRevRec(st);
        st.push(top);
        System.out.print(top+" ");
        StringBuilder sb = new StringBuilder();
       
    }
}

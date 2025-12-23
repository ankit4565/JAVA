package Stacks;

import java.util.Stack;

public class removefromBottom_anyIndex {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        Stack<Integer> gt = new Stack<>();

        while(st.size()>1){
            gt.push(st.pop());
        }

        st.pop();
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }

}

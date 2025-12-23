package Stacks.implementation;

import java.util.ArrayList;

public class ThroughArrayList {
    static void main() {
        ThroughArray.Stack st = new ThroughArray.Stack();
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(8);
        st.display();
        System.out.println(st.size());
        st.push(9);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println( st.peek());
        st.push(7);
        st.push(12);
        System.out.println(st.isFull());

    }

    public static class Stack{
        private ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;


        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            list.add(x);
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("STACK IS EMPTY");
                return -1;
            }
            return list.get(idx-1);
        }

        int pop(){
            if(idx == 0){
                System.out.println("STACK IS EMPTY");
                return -1;
            }
            int top = list.get(idx-1);
            list.add(idx-1, 0);
            idx--;
            return top;
        }

        void display(){
            for(int i =0; i<=idx-1; i++){
                System.out.print(list.get(idx)+ " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx == list.size()) return true;
            else return false;
        }
    }
}

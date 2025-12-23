package Stacks.implementation;

public class ThroughLinkedList {
    static void main() {
         Stack st = new Stack();
         st.push(2);
         st.push(4);
         st.push(6);
         st.push(8);
         st.displayR();
        System.out.println();
        System.out.println("The size of stack is: "+st.size());
         st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.displayR();
    }

  static class Node{
        int val;
        Node next;

        Node(int val){
            this.val  = val;

        }
    }

  static  class Stack{
        Node head = null;
        int size =0;

       void push(int x){
            Node temp = new Node(x);
            temp.next = head;
             head = temp;
             size++;
        }

        //this will print in reverse
        void display(){
           Node temp = head;
           while(temp != null){
               System.out.print(temp.val+ " ");
               temp = temp.next;
           }
        }
        void displayrec(Node h){
           if(h == null) return;
           displayrec(h.next);
            System.out.print(h.val+ " ");
        }
        void displayR(){
           displayrec(head);
            System.out.println();
        }

        int size(){
           return size;
        }

        int pop(){
           if(head == null){
               System.out.println("STACK IS EMPTY");
               return -1;
           }
            int x = head.val;
           size--;
           head = head.next;
           return x;
        }

        int peek(){
            if(head == null){
                System.out.println("STACK IS EMPTY");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
           if(size == 0) return true;
           else return false;
       }
    }


    // Advantage of array implementation of stacks over Linkedlist.
    // 1. Size -> for every element -> space between is one block. (linked take two space one for data and another one for address)
    // 2. display -> O(1)


    // Disadvantage of array implementation of stacks over Linkedlist.
    // 1. Size -> fixed -> overflow.


    // Advantage of LinkedList implementation of stacks over array.
    // 1. Unlimited size.

    // Disdvantage of LinkedList implementation of stacks over array.
    // 1. size -> two data members.
    // 2. display -> reverse -> space complexity -> O(n).
}

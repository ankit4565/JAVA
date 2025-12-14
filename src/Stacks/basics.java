package Stacks;
// Stack is a linear data structure that follows LIFO (Last In First Out) Principle, the last element inserted is the
// first to be popped out. It means both insertion and deletion operations happen at one end only.
//
//
//        LIFO(Last In First Out) Principle
//        The LIFO principle means that the last element added to a stack is the first one to be removed.
//
//        New elements are always pushed on top.
//        Removal (pop) also happens only from the top.
//        This ensures a strict order: last in → first out.

//  Types of Stack:
// 1. Fixed Size Stack
//           A fixed size stack has a predefined capacity.
//           Once it becomes full, no more elements can be added (this causes overflow).
//           If the stack is empty and we try to remove an element, it causes underflow.
//           Typically implemented using a static array.
//           Example: Declaring a stack of size 10 using an array.
//
// 2. Dynamic Size Stack
//           A dynamic size stack can grow and shrink automatically as needed.
//           If the stack is full, its capacity expands to allow more elements.
//           As elements are removed, memory usage can shrink as well.
//           Can be implemented using:
//           -> Linked List → grows/shrinks naturally.
//           -> Dynamic Array (like vector in C++ or ArrayList in Java) → resizes automatically.
//           Example: Stack implementation using linked list or resizable array.
//
// Note: We generally use dynamic stacks in practice, as they can grow or shrink as needed without overflow issues.

import java.util.Stack;
//  In Java, a Stack is a linear data structure that follows the Last In First Out (LIFO) principle and is defined in
//  the java.util package. Internally, it extends the Vector class.
//
//   Stack class maintains insertion order and allows duplicates and null values.
//   Grows dynamically when its capacity is exceeded.
//   All the methods of Stack are synchronized. It is thread-safe.
//   Stack is considered a legacy class, introduced in early versions of Java and a preferred solution to implement Stack
//   Data Structure (especially when thread synchronization is not needed) is either to use ArrayDeque or LinkedList
//   Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.

public class basics {
    static void main() {
//        Stack<Integer> st = new Stack<>();
//
//        st.push(2);
//        st.push(4);
//        st.push(7);
//        st.push(10);
//        System.out.println(st.peek());
//        System.out.println(st);
//
//        st.push(2);
//        st.pop();
//        st.peek();
//        st.size();
//        st.isEmpty();
//        st.search(2);
//        st.indexOf(10,3);
//        String ans ="";
//        String x = "abc";
//      ans = ans.concat(x);
//        System.out.println(ans);

        Stack<String> st = new Stack<>();
//
        st.push("a");
       st.push("b");
       st.push("c");
       st.push("e");
        Stack<String> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
         String ans ="";
        while(gt.size()>0){

            ans = ans.concat(gt.pop());
        }
        System.out.println(ans);
    }
}

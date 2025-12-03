package LinkedList.DoublyLinkedList;

//import static LinkedList.DoublyLinkedList.basic.Node.display;

public class basic {
    static void main() {
          Node a = new Node(4);
          Node b = new Node (5);
          Node c = new Node(6);
          Node d = new Node(10);
          Node e = new Node(23);
          Node head =a;
          Node tail = e;
          a.next = b;
          b.prev = a;
          b.next = c;
          c.prev = b;
          c.next = d;
          d.prev = c;
          d.next = e;
          e.prev = d;
          //insertAtHead(head, 3);
    //    insertAtTail(tail,45);
        insertAtindex(head,3,87);
          basic.display(head);

    }


    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }
        public static  void display(Node head){
            while(head != null){
                System.out.print(head.val+" ");
                  head = head.next;
            }
        }
         public static Node insertAtHead(Node head, int val){
               Node t = new Node(val);
               t.next = head;
               head.prev = t;
               head = t;
               return head;
         }
    public static Node insertAtTail(Node tail, int val){
        Node t = new Node(val);
        tail.next = t;
        t.prev = tail;
        tail = t;
        return tail;
    }
    public static Node insertAtindex(Node head, int index, int val){
               for(int i=0; i<index-1; i++){
                   head = head.next;
               }
               Node p = head;
               Node r = head.next;
               Node t = new Node(val);
               t.next = r;
                r.prev = t;
               t.prev = p;

               p.next = t;
         return head;
    }
}

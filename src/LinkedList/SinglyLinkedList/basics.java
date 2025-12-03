package LinkedList.SinglyLinkedList;



public class basics {
    public class Node {

        int data;
        Node next;

        public Node() {

        }

        public Node(int data) {
            this.data = data;
        }
    }

        public void display(Node head) {

            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
        public void displayR(Node head){
         if(head == null) return;
            System.out.println(head.data);
            displayR(head.next);

        }

//        public void insertAtspecific(Node head, int data, int index){
//            Node new1 = new Node(data);
//                      for(int i=0; i<index; i++){
//                          head = head.next;
//                          if(i== index-1){
//                              head.next = new1;
//                          }
//                          if(i== index){
//                              head.next =
//                          }
//                      }

                      ;
 //       }
      public Node insertAtbeginnig(Node head,int data){
        Node k = new Node();
        k.data = data;
        k.next = head;
        head = k;



        return k;
      }

      public static int length(Node a){
                   int  count= 0;
                 while( a != null){
                      count++;
                      a =  a.next;
                 }
                 return count;
      }

        void main() {
            Node a = new Node(2);
            Node b = new Node(5);
            Node c = new Node(8);
            Node d = new Node(9);
            Node e = new Node(11);
            Node head = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;


//      head =  insertAtbeginnig(head,23);
            // insertAtspecific(head, 15, 3);
//            Node new1 = new Node(20);
//           new1.next = c;
//           b.next = new1;

//            displayR(a);

            System.out.println(length(head));
        }
}


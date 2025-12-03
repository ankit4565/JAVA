package LinkedList.SinglyLinkedList;

public class Implmentation {

    static void main() {
        linkedlist ll = new linkedlist();
             ll.insertAtEnd(2);
             ll.insertAtEnd(5);
             ll.insertAtEnd(8);
             ll.insertAtEnd(23);
             ll.insertAtEnd(87);
             ll.insertAtEnd(5);
             ll.insertAtEnd(3);
             ll.deleteAtindex(2);

           //  ll.insertAtindex(4,5);
             ll.display();
        System.out.println( ll.getAt(0));
        System.out.println("The size Linked list is- "+ll.size);


    }

    public static class Node{

        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size =0;

        public void insertAtEnd(int val){
            Node temp = new Node(val);
            size++;
            if(head == null){
                head = temp;
                tail = temp;
            }else {
                tail.next = temp;

            }
            tail = temp;
        }
        public void insertAtBeginning(int val){
            size++;
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }
        public void insertAtindex(int val, int index){
            size++;
            Node  temp = new Node(val);
             Node t = head;
             if(index == size){
                 insertAtEnd(val);
                 return;

             }else if(index == 0){
                 insertAtEnd(val);
                 return;

             }else if(index<0 || index> size){
                System.out.println("wrong index");
                return;
            }
            for(int i = 1; i<=index-1; i++){
                t  =  t.next;
            }
            temp.next = t.next;
            t.next = temp;
        }

        public void deleteAtindex(int index){
              Node temp = head;
              if(index == 0){
                  head = head.next;
                  size--;
                  return;
              }
              for(int i=1; i<index; i++){
                  temp = temp.next;
              }
              temp.next = temp.next.next;
              tail = temp;
            size--;
        }

        public int getAt(int index){
            Node temp = head;
            for(int i =1; i<=index; i++){
                 temp = temp.next;
            }
            return temp.data;
        }

        public void  display(){
            Node temp   = head;
            while(temp != null ){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

//        int size(){
//            Node temp = head;
//            int count = 0;
//            while(head != null){
//                count++;
//                head = head.next;
//            }
//            return count;
//        }

    }
}

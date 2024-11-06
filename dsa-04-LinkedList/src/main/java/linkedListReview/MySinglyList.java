package linkedListReview;

public class MySinglyList {
    Node head;
    Node tail;
     int size;


     public boolean isEmpty(){
         return  head == null;
     }

     void add(int data){ // insert a node
         // create a new node object from data
         Node node = new Node(data);
         if(isEmpty()){ // if the lest is empty
             head = tail = node;
             size++;
         }else{// if there are elements in list
             tail.next = node;
             tail = node;
             size++;
         }
     }
     void printNodes(){
        Node current = head;
        while(current !=null) {
            if (current.next == null) System.out.println(current.id + " => null ");
            else {
                System.out.print(current.id + " => ");
                current = current.next;
            }
        }

     }
}

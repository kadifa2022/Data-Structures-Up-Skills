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

     void deleteById(int id){
         // check if empty
         if (isEmpty()) {
             System.out.println("List is empty");
         }
         // assign prev and current with the head
         Node prev = head;
         Node current = head;
         // if we find match we need to check 3 cases
         while(current != null) {
             if (current.id == id) { // if there is match => in this if block i need to handle 3 cases
                 // case1: head
                 if (current == head) {
                     head = current.next;
                     current.next = null;
                     size--;
                 } else if (current == tail) {  // case2: ex-tail will be eligible for GC
                     tail = prev;
                     prev.next = null;
                     size--;
                 } else { //case3: middle - current will be eligible for Garbage collection
                     prev.next = current.next;
                     current.next = null;
                 }
                 size--;
             }
             // move forward of the element of the list
                 prev = current;// match
                 current = current.next;
             }
         }
         int indexOf(int id){
         if (isEmpty()) return -1;

         int pos = 0;
         // iterate  through list
         Node current = head; // set my current with starting element
         while(current != null){
             if(current.id == id) return pos;
             pos ++;
             current = current.next;
             }
         return -1;
         }



     void printNodes(){
        Node current = head;
        while(current !=null) {
            // if the current next is last element print add to id null
            if (current.next == null) System.out.println(current.id + " => null ");
            else {// if current is not null print
                System.out.print(current.id + " => ");
            }
                current = current.next;// jump to next element
            }
        }

     }


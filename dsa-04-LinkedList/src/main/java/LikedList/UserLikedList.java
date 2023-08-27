package LikedList;

public class UserLikedList {

    UserNode head;
    UserNode tail;
    int size;


    // need constructor of the class empty
    public UserLikedList() {
        this.size=0;


    }

    boolean isEmpty(){// how we are checking is list empty?
        return head == null; // if head equals null list is empty return
    }

    void insertLast(UserNode node){// two cases for insertion to last
        // Case 1. if List is empty
        if(isEmpty()){
            head=tail=node;// sending node
            // Case 2. not empty
        }else{
            tail.next=node;
            tail= node;// inserting node to the tail
        }
        size++;// increasing size
    }

    void insertFirst(UserNode node){
        // case 1 list is empty

        if(isEmpty()){
            head=tail=node;
            //case 2 not empty
        }else{
            node.next = head;
            head = node;
        }
        size++;
    }


    void printNames() {
        //1. check if list is empty
        if (isEmpty()) {
            System.out.println("List is empty !!!");
            return;
        }
        // Go to the first element in the list
        UserNode current = head;
        System.out.println();
        while (current != null) {
            System.out.print(current.name + " =>");
            current = current.next;
            if(current ==null) System.out.print("null");

        }


    }
    void deleteByName(String name) {
        // check if list is empty
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        //assigning  two nodes
        UserNode prev = head;
        UserNode current = head;
        while(current != null){
            if(current.name.equals(name)){
                //case 1. delete fist/head
                if(current == head){
                    // subcase head and tail can be the same( only one element)if (cu
                if(head ==tail) tail = null;
                head = current.next;// null
                current.next = null;// this is for breaking link between current and next
                                        //case 2. delete tail/las
                  }else if(current == tail) {
                    prev.next = null;
                    tail = prev;
                                    //case 3. delete middle
                     }else{
                    prev.next = current.next;
                    current.next = null;
                }

                size--;
            }
            // move to next node
            prev=current;
            current=current.next;
        }


    }

}

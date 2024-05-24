package ImplementationOfLinkedList;



public class UserLinkedList {

    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList(){
        this.size = 0;
    }
    boolean isEmpty(){// checking if linkedList is empty
        return head == null;
    }

    void insertLast(UserNode node){
        // list is empty
        if(isEmpty()){
            head=tail =node;
        }else{// not empty, put after tail
            tail.next = node;
            tail = node;
        }
        size ++ ;
    }
    void printNames(){
        // if is empty print list is empty
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        // Assign current value to the head
        UserNode current= head;
        //loop
        while (current != null){

        }

    }

}

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

}

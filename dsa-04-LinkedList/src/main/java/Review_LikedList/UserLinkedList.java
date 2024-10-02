package Review_LikedList;

public class UserLinkedList {
    // address of beginning node
    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    // 2 cases for insertion
    void insertLast(UserNode node) {
        //case1 list is empty
        if (isEmpty()) {
            head = tail = node;
        } else { //case2 : list is not empty
            tail.next = node;
            tail = node;
        }
        size++;
    }
    void insertFirst(UserNode node){
        // case1: if list is empty
        if(isEmpty()){
            head =tail = node;
        }else{// if is not empty
            node.next = head;
            head = node;
        }
        size++;
    }


    void printNames(){
        // first check if list is empty
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        //go to the first element in the list
        UserNode current = head;
        System.out.println();
        while(current!=null){
            System.out.print(current.name + " => ");
            current = current.next;
            if(current == null) System.out.print("null");


        }

    }

}


















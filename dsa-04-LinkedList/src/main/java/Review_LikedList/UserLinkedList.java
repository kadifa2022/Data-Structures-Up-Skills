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


    void printNames() {
        // first check if list is empty
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        //go to the first element in the list
        UserNode current = head;
        System.out.println();
        while (current != null) {
            System.out.print(current.name + " => ");
            current = current.next;
            if (current == null) System.out.print("null");


        }
    }
    void deleteByName(String name){
        if(isEmpty()) {// check if list is empty
            System.out.println("List is empty");
        }
        //if is not empty continue -> assign 2 node current and prev
        UserNode current=head;
        UserNode prev =head;

        while (current != null){
            if (current.name.equals(name)){
                //we have to handle 3 cases
                //1. head
                if(current==head){
                    if(current==tail) tail = null;// head and tail might be the same element
                    head = current.next; //null
                    current.next= null; // for breaking link between current and next
                } else if (current==tail) { //case2: deletion last element
                    prev.next = null;
                    tail = prev;
                }else{ // case3: deletion in the middle
                    prev.next = current.next;
                    current.next=null;
                }
                size--;
            }
            prev=current;
            current=current.next;
        }
    }

}


















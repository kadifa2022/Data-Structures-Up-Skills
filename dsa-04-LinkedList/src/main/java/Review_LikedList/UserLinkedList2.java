package Review_LikedList;

public class UserLinkedList2 {
    UserNode head;
    UserNode tail;
    int size;
    public UserLinkedList2(){
        this.size = 0;
    }
    boolean isEmpty(){
        return head == null;
    }
    void insertLast(UserNode node){
        if(isEmpty()){
            head=tail=node;
        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    void insertFirst(UserNode node){
        if(isEmpty()){
            head = tail = node;
        }else{
            node.next = head;
            head = node;
        }
        size ++;
    }
    void printNames(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        UserNode current = head;
        System.out.println();
        while(current != null){
            System.out.print(current.name + " => ");
            current = current.next;
            if(current == null) System.out.println("null");
        }

    }
}

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
}
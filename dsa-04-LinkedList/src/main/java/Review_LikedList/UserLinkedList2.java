package Review_LikedList;

public class UserLinkedList2 {
    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList2() {
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insertLast(UserNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void insertFirst(UserNode node) {
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    void printNames() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        UserNode current = head;
        System.out.println();
        while (current != null) {
            System.out.print(current.name + " => ");
            current = current.next;
            if (current == null) System.out.println("null");
        }
    }

    void deleteByName(String name) {
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        UserNode current = head;
        UserNode prev = head;

        while (current != null) {
            if (current.name.equals(name)) {
                if (current == head) {// if is only one element
                    if (current == tail) tail = null;
                    head = current.next;
                    current.next = null;
                }else if(current == tail){
                    prev.next = null;
                    tail = prev;
                } else {
                    prev.next = current.next;
                    current.next= null;
                }
                size--;



            }
            prev = current;
            current = current.next;
        }
    }


}

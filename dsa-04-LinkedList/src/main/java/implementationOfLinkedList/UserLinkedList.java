package implementationOfLinkedList;



public class UserLinkedList {

    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
        this.size = 0;
    }

    boolean isEmpty() {// checking if linkedList is empty
        return head == null;
    }

    void insertLast(UserNode node) {
        // list is empty
        if (isEmpty()) {
            head = tail = node;
        } else {// not empty, put after tail
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void printNames() {
        // if is empty print list is empty
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        // Assign current value to the head
        UserNode current = head;
        System.out.println();
        //loop
        while (current != null) {
            System.out.print(current.name + " => ");
            current = current.next;
            if (current == null) System.out.print("null");
        }
    }

    void deleteByName(String name) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        UserNode prev = head;
        UserNode current = head;

        while (current != null) {
            if (current.name.equals(name)) {// found and delete it
                //case 1: head
                if (current == head) {
                    if (head == tail) tail = null;
                    head = current.next;
                    current.next = null; // break reference from current
                    //case 2: tail
                } else if (current == tail) {
                    prev.next = null;
                    tail = prev;
                } else {// case 3: middle
                    prev.next = current.next;
                    current.next = null;
                }
                size--;
            }
            prev = current;
            current = current.next;
        }

    }
}
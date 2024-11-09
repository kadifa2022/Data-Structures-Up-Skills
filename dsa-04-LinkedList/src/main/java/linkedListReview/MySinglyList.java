package linkedListReview;

public class MySinglyList {
    Node head;
    Node tail;
    int size;


    public boolean isEmpty() {
        return head == null;
    }

    void addToLast(int data) { // insert a node to the tail
        // create a new node object from data
        Node node = new Node(data);
        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else {// if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void addFirst(int data) {
        // create new node from data
        Node node = new Node(data);
        // case 1; list is empty
        if (isEmpty()) {
            head = tail = node;
        } else {//case 2: list is not empty
            node.next = head;
            head = node;
        }
        // increase size
        size++;
    }

    void deleteById(int id) {
        // check if empty
        if (isEmpty()) {
            System.out.println("List is empty");
        }
        // assign prev and current with the head
        Node prev = head;
        Node current = head;
        // if we find match we need to check 3 cases
        while (current != null) {
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

    int indexOf(int id) {
        if (isEmpty()) return -1;

        int pos = 0;
        // iterate  through list
        Node current = head; // set my current with starting element
        while (current != null) {
            if (current.id == id) return pos;
            pos++;
            current = current.next;
        }
        return -1;
    }

    public int getKthFromLast(int k) { //we don't know the size
        // assigning 2 pointers
        Node ptr1 = head;
        Node ptr2 = head;
        // move ptr2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        // ptr1 is on the kth element from the last
        return ptr1.id;

    }

    public void removeKthFromLast(int k) {
        // create 3 pointers
        Node ptr1 = head;
        Node ptr2 = head;
        Node prev = null;
        // move ptr2 k-1 times
        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;
        }
        // move both pointers until ptr2 hits the last element
        while (ptr2.next != null) {
            prev = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }// ptr1 is on the kth element from last
        // do delete operation
        if (ptr1 == head) {
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else if (ptr1 == tail) {
            tail = prev;
            prev.next = null;
            size--;
        } else {
            prev.next = ptr1.next;
            ptr1.next = null;
            size--;
        }
    }

    public void removeKthFromLast2(int k) {// Lorens solution
        Node ptr1 = head;
        Node ptr2 = head;

        for (int i = 0; i < k - 1; i++) {
            ptr2 = ptr2.next;

            if (ptr2 == null) System.out.println("Less than kth elements");
            else if (ptr2.next == null) {
                head = ptr1.next;
                ptr1.next = null;
                return;
            }
        }
        while (ptr2.next.next !=null){
            ptr1 = ptr1.next;
            ptr2= ptr2.next;
        }
        ptr1.next = ptr1.next.next;
        ptr1= ptr1.next;
        ptr1=null;

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


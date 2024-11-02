package lruCache;

public class DNode { //node class for  doubly linked list

    int key; // my data
    int value;
    DNode prev; // Reference type /variable that's hold address of the node class
    DNode next;

    public DNode(int key, int value) { // constructor for key, value
        this.key = key;
        this.value = value;
    }

    public DNode() { // constructor of the node class
    }
}

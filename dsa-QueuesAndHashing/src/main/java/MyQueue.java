import java.util.NoSuchElementException;

public class MyQueue <T> {
    QNode<T> front;
    QNode<T> back;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    T peek() {// get yhe value
        return (T) front.value;
    }

    void enqueue(T item) { // adding node
        QNode<T> node = new QNode<>(item);// created new node;
        if (isEmpty()) front =back= node;
        else {
            back.next = node;
            back=node;
        }
        size++;
    }
    T dequeue(){ // deleting node
        QNode frontNode;
        if(isEmpty()) throw new NoSuchElementException(" No elements");
        if(front==back){// if is one element
            frontNode= front;
            front= back = null;
        }else {// if is more than one element
            frontNode= front;
            front= front.next;
        }
        size--;
        return (T) frontNode.value;
    }
    int size() {return size;
    }
















}
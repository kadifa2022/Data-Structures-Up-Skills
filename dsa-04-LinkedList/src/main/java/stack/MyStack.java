package stack;

import java.util.Stack;

public class MyStack <T>{
    private T[] stackArray;
    private int top;
    private int capacity;

    // Constructor ti initialize the stack
    public MyStack(){
        capacity = 10; // initial capacity of the stack
        stackArray=(T[]) new Object[capacity];
        top = -1; // indicates the stack is Empty
    }
    // Pushes an element into the stack
    public void push(T element){
        if(isFull()){
            resizeStack();
        }
        stackArray[++top]= element;

    }
    //Pops an element from the stack
    public T pop(){
        if(isEmpty()){
            throw  new IllegalStateException("Stack is empty");
        }
        return stackArray[top--];
    }
    //Peeks at the top element of the stack without removing it
    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return stackArray[top];
    }
    // Returns true if the stack is empty
    public boolean isEmpty(){
        return top ==-1;
    }
    // Returns true if stack is full
    public boolean isFull(){
        return top == capacity -1;
    }
    // Resize the stack when it becomes full
    public  void resizeStack(){
        capacity *=2;
        T[] newStack = (T[]) new Object [capacity];
        System.arraycopy(stackArray,0,newStack,0, stackArray.length);
        stackArray = newStack;
    }

}

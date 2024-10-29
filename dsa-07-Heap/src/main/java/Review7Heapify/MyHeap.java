package Review7Heapify;

import java.util.NoSuchElementException;


public class MyHeap {
    int [] items;
    int size;
    public MyHeap(int capacity){ // creating heap and initial capacity
        this.items = new int[capacity];
        this.size=0; // re-set the size
    }
    public MyHeap(int [] arr){ // constructor heap  with integer arr
        this.items = new int[arr.length];// capacity will be arr.length and will be copied to items
        this.size = arr.length;//
        this.items = arr;
        heapify();

    }

    private void heapify() {
        int startIndex = (size/2)-1; //
        for(int i = startIndex; i>=0; i--){
            // if current element is not valid parent  bubble down until it is valid.
            heapifyCurrent(i);

        }

    }

    private void heapifyCurrent(int index) {
        if(!isValidParent(index)){
            int largestChildIndex = largerChildIndex(index);
            swap(index, largestChildIndex);
            heapifyCurrent(largestChildIndex);
        }
    }


    public int peek(){// will not remove the root
        if(size == 0) throw new NoSuchElementException();
        return items [0];
    }

    public void insert(int value){// if is array full throw exception else ++ to array
        if(size == items.length) throw  new IllegalStateException();
     else {
         items[size++] = value;
         bubbleUpp();
        }
    }

    private void bubbleUpp() {
        // calculate start point index
        int index = size -1;
        // compare new inserted value in proper place
        // while index is > 0 %% parent is less than child continue
        // 1. swap child and paren
        // calculate next index= parent index
        while(index> 0 && items[index]> items[parentIndex(index)]){
            //swap
            swap(index, parentIndex(index));
            // assign index with the parent index
            index= parentIndex(index);// like current= current.next
        }
    }
    public int remove(){ // first we check the size if is == 0 there is nothing to remove iit
        if(size == 0) throw  new NoSuchElementException();
        else{// we get index 0/root
            int result = items[0];
            items[0] = items[--size]; // remove the root and then take the last element move to the root
            bubbleDown();// here bubble down
            return result;
        }
    }

    private void bubbleDown() {
        int index = 0; // starting point we place the last element to the index 0
        int largerChildIndex; // need to find largerChildIndex
        while(index<=size && !isValidParent(index)){ // comparing parent with larger child and use another method if is valid parent or not
            largerChildIndex = largerChildIndex(index); // if we find greater than paren parent need to be swaped
            swap(index, largerChildIndex); // will continue until parent is valid
            index = largerChildIndex;

        }
    }

    private int largerChildIndex(int index) {
        if(!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)) {

            return leftChildIndex(index);
        }
        return items[leftChildIndex(index)]> items [rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);
    }

    private boolean isValidParent(int index) { // here we will compare parent with children
        if(!hasLeftChild(index)) return true;
        else{
            boolean isValid = false;
            if(hasRightChild(index)){
                isValid = (items[index]>= items[leftChildIndex(index)] && items[index]>=items[rightChildIndex(index)]);
            }
            return  isValid;
        }
    }

    private boolean hasRightChild(int index) {
      return   rightChildIndex(index)<= size;
    }

    private int  rightChildIndex(int index) {
        return index * 2+2;

    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index)<= size;
    }

    private int leftChildIndex(int index) {
        return index*2+1;
    }


    private void swap(int first, int second) {// swap method
        int temp = items[first];
        items[first] = items[second];
        items[second]= temp;
    }

    private int parentIndex(int index) {
        return (index-1)/2;
    }

    public void printHeap(){
        for(int i =0; i<size; i++){
            System.out.println(items[i] + " , ");
        }
        System.out.println();
    }

}

public class HeapApp {
    public static void main(String[] args) {
        MyHeap heap = new MyHeap(10);
        heap.insert(61);
        heap.insert(120);
        heap.insert(52);
        heap.insert(45);
        heap.insert(81);
        heap.printHeap();
        heap.insert(10);
        heap.remove();
        int [] numbers ={1,2,5,6,8,21,0};



    }

}

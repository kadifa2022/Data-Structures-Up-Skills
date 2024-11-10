import java.util.LinkedList;
import java.util.Queue;

public class CollectionsQueue {
    public static void main(String[] args) {

        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        Queue<Integer> collQ= new LinkedList<>();
        collQ.add(5);
        collQ.add(6);
        System.out.println(collQ.remove());


    }
}

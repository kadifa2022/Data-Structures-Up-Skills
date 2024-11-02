package lruCache;

public class LRUTestApp {
    public static void main(String[] args) {

        LRU_Cache lru = new LRU_Cache(3);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        System.out.println("Current LRU Cache: ");
        lru.printLRU();
        System.out.println(lru.get(1));// Access, makes(1,1) most recent use
        lru.put(4,4);
        System.out.println(lru.get(2));
        System.out.println("HashMap of LRU");
        lru.printLRU();
        System.out.println("LinkedList of LRU");
        lru.printLinkedList();

    }
}

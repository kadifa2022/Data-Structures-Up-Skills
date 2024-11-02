package lruCache;


import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {
    int size;
    int capacity;
    HashMap<Integer,DNode> cacheMap = new HashMap<Integer, DNode>();// Will hold address of the nodes
    // I need two dummy nodes
     DNode head;
     DNode tail;

    public LRU_Cache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.head = new DNode();
        this.tail = new DNode();
        head.next = tail; // head is pointing to the tail
        tail.prev = head;// tail is pointing to the head
    }


  public void addNode(DNode node){// help method
        node.prev= head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node; // add node after head

  }
  public void removeNode(DNode node){// remove node help method
        DNode prevNode = node.prev; // created dummy nods
        DNode nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

  }
  public void moveToFirst(DNode node){ // help method
        removeNode(node);
        addNode(node);// insert into first place
  }
  public DNode popLast(){ // help method
        DNode  popped = tail.prev;
        removeNode(popped);
        return popped;
    }
    public int get(int key) {
        //Go and check  hashMap if you have the key
        DNode node = cacheMap.get(key);
        // return -1 if you don't have key
        if (node == null) return -1;
        else {
            moveToFirst(node);// make it recent
            return node.value;// return value of the node
        }
    }

    public void put (int key, int value){
        // check map if you have item that should be updated
        DNode node = cacheMap.get(key);
        if(node == null){// if i  don't have this key in my LRUCache map
            DNode  newNode = new DNode(key, value);
            cacheMap.put(key, newNode); //put in hashMap
            addNode(newNode);// put in liked list
            size ++;
            if(size> capacity){
                DNode last = popLast();// remove from the linked list if is full of capacity
                cacheMap.remove(last.key);
                size --;
            }
        }else{// if i have this key in my lru
            node.value = value;// update the value
            moveToFirst(node);// make it recent
        }
    }
    void printLRU() { // print lru
        for (Map.Entry<Integer, DNode> entry : cacheMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
   void  printLinkedList(){// print linked list method
        DNode curr = head;
        while(curr!=null){
            if(curr.value != 0) System.out.print(curr.value);
            curr = curr.next;
        }

   }

}

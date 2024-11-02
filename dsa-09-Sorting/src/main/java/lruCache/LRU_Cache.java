package lruCache;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {
    int size;
    int capacity;
    HashMap<Integer,DNode> cacheMap = new HashMap<Integer, DNode>();
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


  public void addNode(DNode node){
        node.prev= head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;

  }
  public void removeNode(DNode node){// remove node
        DNode prevNode = node.prev; // creeated dummy nods
        DNode nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

  }
  public void moveToFirst(DNode node){
        removeNode(node);
        addNode(node);
  }
  public DNode popLast(){
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
                DNode last = popLast();// remove from the linked list
                cacheMap.remove(last.key);
                size --;
            }
        }else{// if i have this key in my lru
            node.value = value;// update the value
            moveToFirst(node);// make it recent
        }
    }
    void printLRU() {
        for (Map.Entry<Integer, DNode> entry : cacheMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}

package hashMap;

import java.util.LinkedList;

public class Bucket {// creating empty bucket and Linked list for k,v pairs and will be kept in bucket class
    LinkedList<KeyValue<Integer,Integer>> bucket;
    public Bucket(){
        this.bucket = new LinkedList<KeyValue<Integer,Integer>>();
    }
}

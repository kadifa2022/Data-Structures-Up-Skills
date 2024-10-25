package hashMap;

import java.util.LinkedList;

public class Bucket {// creating empty bucket and Linked list for k,v pairs and will be kept in bucket class
    LinkedList<KeyValue<Integer,Integer>> bucket;
    public Bucket(){
        this.bucket = new LinkedList<KeyValue<Integer,Integer>>();
    }
    public int get(int key) {
        for (KeyValue<Integer, Integer> pair : bucket) {
            if (pair.key.equals(key)) { return pair.value;
            }
        }
        return -1;
    }
    public void remove(int key){
        for(KeyValue<Integer, Integer> pair:bucket){
            if(pair.key.equals(key)) {
                this.bucket.remove(pair);
                break;
            }
        }

    }
    public void update(int key, int value) {
        // if Key exists then update value part
       boolean found = false;
       for(KeyValue<Integer, Integer> pair:bucket){
           if(pair.key.equals(key)){
               pair.value =value;
               found = true;
           }
       }
       // else add key and value as new pair
        if(!found ) this.bucket.add(new KeyValue<Integer, Integer> (key, value));
    }
}

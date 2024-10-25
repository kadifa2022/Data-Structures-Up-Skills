package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
    public List<Bucket> hashMap;
    public int modNumber;

    public MyHashMap(){ //myHashMap
        this.modNumber= 2341;
        this.hashMap = new ArrayList<>();
        for(int i = 0; i < 2341; i++){
            this.hashMap.add(new Bucket());
        }

    }
    public void put(int key, int value){
        //calculate index address with modules
        int hashCode = key % modNumber; // now i have index
        this.hashMap.get(hashCode).update(key, value);

    }
    public int get(int key){
        //calculate index address with modules
        int hashCode = key % modNumber; // I have index now
        return this.hashMap.get(hashCode).get(key);

    }
    public void remove(int key){
        //calculate index address with modules
        int hashCode = key % modNumber; // I have index now
        this.hashMap.get(hashCode).remove(key); // calling remove method from the bucket

}
}
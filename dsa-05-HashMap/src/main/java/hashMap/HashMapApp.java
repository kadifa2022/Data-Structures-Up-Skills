package hashMap;

public class HashMapApp {
    public static void main(String[] args) {

        MyHashMap hm = new MyHashMap();
        hm.put(1,1);
        hm.put(3,3);
        System.out.println(hm.get(1));
        hm.put(1,24);
        System.out.println(hm.get(1));
        hm.put(2342, 2342);
        System.out.println(hm.get(1));
        System.out.println("This line should return 2342: " + hm.get(2342));
    }
}

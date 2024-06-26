package collectionsReview;

import java.util.*;
import java.util.stream.Collectors;

public class MapReview2 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1,"Jack");
        studentMap.put(2,"Julia");
        studentMap.put(3,"Alison");
        studentMap.put(4,"Jack2");

        // how to get values from a map
        List<String > list =  studentMap.values().stream().collect(Collectors.toList());

        // How  to get the value and sort them
        List<String> list2 = studentMap.values().stream()
                .sorted((o1,o2)->o1.compareToIgnoreCase(o2)).collect(Collectors.toList());
        System.out.println(list2);

        //how to get key and value EntrySet()
        Set<Map.Entry<Integer, String>> entrySet = studentMap.entrySet();
        System.out.println(entrySet);

        // how to get keySet()
        Set<Integer> keySet = studentMap.keySet();
        System.out.println(keySet);

        for (Integer integer : keySet) {
            System.out.println(integer);

        }









    }
}

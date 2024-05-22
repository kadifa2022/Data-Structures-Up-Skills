import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1,"Lejla");
        studentMap.put(2,"Julia");
        studentMap.put(3,"Alison");
        studentMap.put(4,"Jack");

        //How to get value from a map
        List<String> list = studentMap.values().stream().collect(Collectors.toList());

        //How to get entrySet
        Set<Map.Entry<Integer, String>> entries = studentMap.entrySet();
        System.out.println(entries);

        //How to get KeySet
        Set<Integer> keySet = studentMap.keySet();
        System.out.println(keySet);

        // iteration one by one
        for (Integer integer : studentMap.keySet()) {
            System.out.println(integer);

        }


        //How to get value and sort them
        List<String> list2 = studentMap.values().stream()
                .sorted(((o1, o2) -> o1.compareToIgnoreCase(o2)))
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}

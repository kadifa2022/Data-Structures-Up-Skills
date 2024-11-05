package collectionsReview.collectionsReview2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
        //create map
        Map<Integer, String> studentMap = new HashMap<>(); //if we have key O(1)
        studentMap.put(1, "Jack");
        studentMap.put(2, "Julia");
        studentMap.put(3, "Joe");
        studentMap.put(4, "Jasmin");
        String st = "JJavaDeveloper";
        System.out.println(findFirstNonRepeatingCharacter(st));

    }

    public static Character findFirstNonRepeatingCharacter(String str) {
        // create map -> cost me additional space complexity using another ds
        Map<Character, Integer> map = new TreeMap<>();
        int count;
        // count the frequency of char
        for (Character ch : str.toCharArray()) {
            if(map.containsKey(ch)){
               count = map.get(ch);
               map.put(ch, count+1);
            }
            else map.put(ch, 1); // first time putting character in map
        }
        // start from the beginning and check if there is a char with frequency 1
        for(Character ch: str.toCharArray()){
            if(map.get(ch) == 1) return ch;
        }
   return null;// will return null if we don't find non repeating
    }

}
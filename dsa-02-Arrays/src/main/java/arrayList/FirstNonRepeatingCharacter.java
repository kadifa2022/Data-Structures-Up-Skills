package arrayList;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {


        // Find the first n on-repeating char in a string
        //example:
        String str = "Java Developer";
    }
        public Character findFirstNonRepeatCharacter (String str){
            Map<Character, Integer> map = new HashMap<>();

            int count = 0;

            for (Character ch : str.toCharArray()) {
                if (map.containsKey(ch)) {
                    count = map.get(ch);
                    map.put(ch, count + 1);
                } else
                    map.put(ch, 1);
            }
            for (Character ch : str.toCharArray()) {
                if (map.get(ch) == 1) return ch;
            }
         return null;
        }

    }

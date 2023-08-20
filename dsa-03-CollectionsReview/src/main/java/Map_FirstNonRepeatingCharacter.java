import java.util.HashMap;
import java.util.Map;

public class Map_FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        // create hashMap
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1,"Jack");
        studentMap.put(2, "Julia");
        String str = "JJavvaDDevelloper";
        System.out.println();

    }

    public static Character findFirstNonRepeating(String str){
        // create a map: this will cost me space complexity o(n)
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        //count frequency of char
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
                count=map.get(ch);
                map.put(ch, count + 1);
            }
            else map.put(ch, 1);
        }

        // start from beginning and check if there is a char with frequency 1
        for(Character ch: str.toCharArray()){
            if(map.get(ch)== 1) return ch;
        }
        return null;

    }


}

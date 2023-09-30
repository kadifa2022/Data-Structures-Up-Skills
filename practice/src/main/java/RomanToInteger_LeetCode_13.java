import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_LeetCode_13 {

    public static void main(String[] args) {


        System.out.println(romanToInteger("MCMXCIV"));

    }

    public static int romanToInteger(String s) {

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int num = s.length();



        for (int i = 0; i < num; i++) {
            if (i < num - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}

/*
We iterate through each character of s using a for loop, checking if the
 current character is smaller than the next character. If so, it subtracts
 the corresponding value from the result. This is because in Roman numerals,
  when a smaller numeral appears before a larger one, it indicates subtraction.
  Otherwise, it adds the corresponding value to the result. eg:
   IX => 1(I) < 10(X) => result = -1 => result = -1 + 10 = 9
 */
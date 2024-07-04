package collectionsReview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabdc";
        System.out.println(lengthOfLongestSubstring(s));

    }

    // first solution with the map

    public static int lengthOfLongestSubstring(String s){

        int maxLength = 0;
        Map<Character, Integer> visitedCharacter = new HashMap<>();
        for(int right = 0, left =0;right<s.length(); right++){
            char currentCharacter = s.charAt(right);
            if(visitedCharacter.containsKey(currentCharacter) &&
                    visitedCharacter.get(currentCharacter)>=left){
                left = visitedCharacter.get(currentCharacter) + 1;
            }
            maxLength = Math.max(maxLength, right - left +1);
            visitedCharacter.put(currentCharacter,right);

        }
        return maxLength;
    }

}

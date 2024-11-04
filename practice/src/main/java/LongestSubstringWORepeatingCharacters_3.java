import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWORepeatingCharacters_3 {
    public int  lengthOfLongestSubstring(String s){ // using indexOf()
       // String str = "abcabcbb";
        int maxLength =0;

        for(int right = 0, left = 0; right<s.length(); right ++){
            // looking for indexOf that current character thar right pointer is looking at
            // they are not searching entire string where that character first appear they have start at left pointer
           int indexOfFirstAppearanceInSubString = s.indexOf(s.charAt(right), left);
           // if that index where character is, is different from the right pointer
            //(It exists somewhere in substring)/ of course exists where the right pointer is pointing at right now, but
            //if appearance another time that's mean we have repeated character
           if(indexOfFirstAppearanceInSubString !=right){
               // if we do repeat character we move left pointer to be one passed where the repeating charter is found.
               left =indexOfFirstAppearanceInSubString +1;
           }
           //
           maxLength = Math.max(maxLength,right-left +1);


        }
       return  maxLength;
    }
    public  int longestSubstring(String s){
        // using 2 pointers and hashSet/sliding window
        int a_pointer=0;
        int b_pointer=0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        while(b_pointer<s.length()){
            if(!hashSet.contains(s.charAt(b_pointer))){
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(), max);
            }else{
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}

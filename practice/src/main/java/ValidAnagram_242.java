public class ValidAnagram_242 {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagarm";
        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram2(s, t));


    }

    public static boolean isAnagram(String s, String t){
        // first length must be the same if not is not anagram
        if(s.length() != t.length()) return  false;

        int []char_counts  = new int[26];//
        for(int i = 0; i < s.length(); i++){ // we are looping trough s string and count letter
            char_counts[s.charAt(i)-'a']++; //incrementing for s string
            char_counts[t.charAt(i)-'a']--;// de cremating for t string
            // if the all count even 0 it is even count
        }
        for(int count : char_counts){
            if(count != 0){
                return false;
            }
        }
        return  true;
    }

    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()) return false;
        int [] char_count= new int[26];

        for(int i = 0; i<s.length(); i++){
            char_count[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            if(char_count[t.charAt(i) - 'a']==0) return false;
            char_count[t.charAt(i) - 'a']--;

        }
        return true;
    }



}

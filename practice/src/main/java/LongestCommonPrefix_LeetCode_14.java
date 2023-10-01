public class LongestCommonPrefix_LeetCode_14 {

    public static void main(String[] args) {

    }

    public static String longestCommonPrefix( String [] str){
        // if is no string in array we can return am empty string
        if(str.length == 0) return "";
        // we are setting prefix to first element in array
        String prefix =str[0];
        // we  loop from second element(fist index)  through the rest
        for (int i = 1;i<str.length; i++){
            // while current string "flow". indexOf(prefix) is not equals to 0
            while(str[i].indexOf(prefix) !=0){
            // if we can not find  prefix on the beginning of the string, we will decrease size of the string
            prefix = prefix.substring(0, prefix.length()-1); // this will reduce character by one each time

            }

        }
        return prefix;


    }

}

/*
prefix = "flower" -> longest string
["flower", "flow", "flight"]
 to loop through time complexity will be O(n2) . What is the better approach?
Set up the longest String as prefix and when we go with rest of the elements we can remove letters off the 'flower'.
 Starting with the longest word as you go through the words you just reduced.
 */
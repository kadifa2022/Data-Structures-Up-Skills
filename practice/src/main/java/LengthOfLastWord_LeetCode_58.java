public class LengthOfLastWord_LeetCode_58 {

    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String str){
        if(str.length() == 0){
            return 0;
        }
        int count =0;
        for(int i =str.length()-1; i>=0; i--){
            if(str.charAt(i) != ' '){
                count++;
            }
            else if(count>0){
                return count;
            }
        }
        return count;

    }


}

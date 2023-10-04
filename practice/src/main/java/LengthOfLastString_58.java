public class LengthOfLastString_58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   brake  the loop  "));


    }

    public static int lengthOfLastWord(String s){
        String str = s.trim();// taking off-white spaces
         int count =0;

         for(int i = str.length()-1; i>=0; i--){// starting from the back loop until space
             if(str.charAt(i) !=' '){
                 count++; //increase count
             }else{
                 break;
             }


         }
         return count;

    }


}

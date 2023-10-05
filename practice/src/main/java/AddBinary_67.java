public class AddBinary_67 {
    public static void main(String[] args) {

        System.out.println(addBinary("1010", "1011"));

    }

    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();// class
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i>=0 || j >=0){
            int sum =carry;
            if(i>=0) sum += a.charAt(i)-'0';
            if(j>=0) sum += b.charAt(j)-'0';
            sb.append(sum%2);
            carry = sum/2;
            i--;
            j--;
         }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();

    }

}
// binary numbers are zero and one (010101010101)
//3-> 11
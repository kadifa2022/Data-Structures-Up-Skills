public class PalindromeNumber_LeetCode_9 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));

    }

    public static boolean isPalindrome(int x) {

        int temp = x;
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10; // will give us last digit
            reverse = (reverse * 10) + digit;
            x = x / 10; // dividing by 10
        }

        // comparing putting checking conditions
        if (reverse == temp) {

            return true;
        }

        return false;

    }


}
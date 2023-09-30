public class PalindromeNumber_LeetCode_9 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome2(121));

    }
// one solutions
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
    public static boolean isPalindrome2(int x){

        if(x<0){ return false;
        }
        int copy = x;
        int rev = 0;

        while(copy > 0){
            int digit = copy % 10;
            rev= rev * 10 + digit;
           copy /= 10;
        }
        return rev == x;
    }


}
/*
Thought before coding
- A palindrome is a string that can be read the same way forward and backward.
- we will implement the approach that does not require us to convert Integer to a string
  - How we can reverse "x"?
  -We can create variable "reverse" to keep track of reversed "x"
  -We will need process the digits of "x from right to -> left
  - In order to retrieve the rightmost digit, we can use module operator
    - rightmost digit * x % 10
  -Then Multiple 'reverse' by 10, then increment by rightmost 'digit'
  -remove the rightmost digit 'x' using the division operator
    - x = x / 10
  -After, we process all of the digits of 'x'
  - we will compare 'x' with reverse forms


** Answer

-Lets validate input parameter
 -if 'x' is negative, returns False
 -create two variables
         -> copy, equals to 'x'
         -> reverse, reverse form of 'x'
 -While 'copy' is greater than 0
   -> retrieve the rightmost digit
      -> digit = copy % 10
   ->Multiply 'reverse' by 10 and then increment by 'digit'
   -remove rightmost digit
     -> copy= copy /10
 -Return true if 'reverse' is equal to 'x' else, return false

 -What is the Time and Space complexity?
 Time complexity - O(logx), where x is the input value
   - O(logx), because we process, each of the digits of 'x'
 Space complexity - O(1)




 */
public class TwoSum_II_With2Pointers_167 {
    public static void main(String[] args) {

    }
     public static int [] twoSumWith2Pointers(int [] numbers, int target){

        // define pointers
         int L =0, n = numbers.length , R = n-1;
         // two pointers find the sum

         while(L < R){ // while left is less than right
             int sum = numbers[L] + numbers [R]; // defining sum-> sum is equals numbers on L and numbers on R// o
             if(sum == target){// once we have sum, we will  see if is sum equals to target
                 return new int [] {L +1, R+1};//if is equal we are returning positions on  0 element
             }else if(sum< target){// if is less than target
                 L++;//we are moving left pointer by 1
             }else{
                 R--;// we are moving right pointer by 1 to the left
             }
         }
         return new int[] {-1,-1};//if don't find solution we are returning negative one, negative one
     }
}

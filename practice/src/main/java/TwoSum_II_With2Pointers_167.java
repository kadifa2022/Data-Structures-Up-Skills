public class TwoSum_II_With2Pointers_167 {
    public static void main(String[] args) {

    }
     public static int [] twoSumWith2Pointers(int [] numbers, int target){

        // define pointers
         int L =0, n = numbers.length , R= 0;
         // two pointers find the sum

         while(L < R){
             int sum = numbers[L] + numbers [R];
             if(sum == target){
                 return new int [] {L +1, R+1};
             }else if(sum< target){
                 L++;
             }else{
                 R++;
             }
         }
         return new int[] {-1,-1};
     }
}

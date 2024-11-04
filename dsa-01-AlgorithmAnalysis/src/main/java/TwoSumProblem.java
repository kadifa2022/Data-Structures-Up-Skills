import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int [] numsArray = new int[]{2,7,9,11};
        System.out.println(Arrays.toString(twoSumProblem(numsArray,7)));

    }
// bruteforce solution
// using static to call the method through the class and, also we did not create object
    public static int []twoSumProblem(int [] nums, int target){ //O(n)

        for(int i =0; i< nums.length; i++){
            for(int j = 1; j<nums.length; j++){ // starting from 1 because we can't use same number twive
                if(i!=j) { // can't be the same numbers
                    if (nums[i] + nums[j] == target) ;
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candies ={2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3).toString());
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        // create return type
        List<Boolean> result = new ArrayList<>();
        // find max candies
        int max = Arrays.stream(candies).max().getAsInt();//o(n)
        // for loop iteration to check with extra candies
        for (int candy : candies) {// for each candy I'm adding result(O(n))
            result.add(candy + extraCandies >= max);
        }
        return result;
    }






}




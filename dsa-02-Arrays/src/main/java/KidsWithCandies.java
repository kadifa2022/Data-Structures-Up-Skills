import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3).toString());

    }

    public static List<Boolean> kidsWithCandies(int [] candies, int extraCandies){
        //create return type
        List<Boolean> result = new ArrayList<>();
        // time complexity o(n)  no space complexity
        //find max candies with loop
        /*
        int max= -1;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > max) max = candies[i];
             }
               */
        int max = Arrays.stream(candies).max().getAsInt(); //finding max with stream

/*        //for loop to iterate to check with extra candies with loop
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else  result.add(false);

 */
        //for each loop to check with extraCandy
        for (int candy : candies) {
            result.add(candy + extraCandies>=max);
        }
        //return the result
        return result;

    }

}

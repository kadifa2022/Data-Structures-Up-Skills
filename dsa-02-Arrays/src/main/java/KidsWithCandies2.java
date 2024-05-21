import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies2 {
    public static void main(String[] args) {
        int[] candies = {1, 2, 3, 4, 5};

        System.out.println(kidsWithCandies(candies,3).toString());

    }


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
       int max = Arrays.stream(candies).max().getAsInt();

        for (int candy : candies) {
            if(candy + extraCandies >= max){
                result.add(true);
            }else result.add(false);

        }
        return result;


    }


}


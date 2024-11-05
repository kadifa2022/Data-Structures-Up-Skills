import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {
    public static void main(String[] args) {
        int [] arr = new int[]{2,7,9,11};
        System.out.println(Arrays.toString(twoSumOptimalSolution(arr, 9)));

    }

    public static int [] twoSumOptimalSolution(int [] array, int targetValue){
        // create hashMap
        Map<Integer, Integer> map = new HashMap<>();// o(n) complexity but i have space complexity O(n)

        for(int i = 0; i< array.length; i++){
            int potentialMatch = targetValue - array[i];
            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i], i);
        }

        return new int [] {};

    }

}

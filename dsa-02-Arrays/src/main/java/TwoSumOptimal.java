import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {

    public static void main(String[] args) {
        int [] array = new int[] {2,7,9,11};
        System.out.println(twoSumOptimalSolution(array, 9));
    }
    //complexity of solution is O(n), space complexity O(n)
     public static int[] twoSumOptimalSolution(int [] array, int targetValue){

        //Create hashMap
         Map<Integer, Integer> map = new HashMap<>();

         for(int i = 0; i<array.length; i++){
             int potentialMatch= targetValue - array[i];
             if(map.containsKey(potentialMatch)) return new int[] {i, map.get(potentialMatch)};
             else map.put(array[i], i);
         }
        return new int[] {};

    }
}

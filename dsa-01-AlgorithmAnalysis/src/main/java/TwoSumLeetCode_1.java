import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode_1 {

    public int [] twoSum(int[] nums, int target){ // brute force solution
        for (int i = 0; i< nums.length; i++){
            for(int j = i+1 ;j< nums.length; j++){
                if (nums[i] + nums[j] == target) {
                    return  new int[] {1,2};

                }
            }
        }
        return nums;
    }

    public int [] twoSumOptimalSolution(int [] nums, int target){
        // create hashMap
        // Key will be complements that we are using
        // Value
        Map<Integer, Integer> complementsMap = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            // we store map
          Integer complementIndex = complementsMap.get(nums[i]);// if the number as key exits in map they will retrieve for us
            if(complementIndex != null){ // we found the match and return 2 indicies
                                // index if the number and complements index
                return new int[]{i, complementIndex};
            }// target minus number that we are looking in array, second parameter index value i
            complementsMap.put(target -nums[i],i );

        }
        return nums;

    }

}
// big O (n2) because of the time complexity, nested loop
/*
{5,2,4}
target 6
HashMap/  collection of the key, value pairs.
K -> V
1-> 0 (1 is complement number (when we add to the 5 which is index 0) we got the target number
4-> 1 (4 is complement number (when we add to the 2 which is index 2) we got the target
{2,1}
 */
import java.util.HashMap;
import java.util.Map;

public class TwoSum_II_leetcode_167 {// input Array is sorted
    public static void main(String[] args) {

    }
    public static int [] twoSum(int [] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target-nums[i]) +1, i +1};
            }else{
                map.put(nums[i],i );
            }
        }

        return new int[]{-1,-1};
    }

    // two pointers -> linear


    //base

}

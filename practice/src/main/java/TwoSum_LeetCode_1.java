import java.util.HashMap;
import java.util.Map;

public class TwoSum_LeetCode_1 {
    public static void main(String[] args) {



    }

    public  static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return  new int[] {i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];

    }
}
/*
(Can be done with nested loop but will cost us time complexity  (n^2))

Optimized approach

-For each of the element 'x'
-We will want to check if 'target -x ' exists
-This is because 'x + target -x' is equal to 'target'
-We will want a way to save the previous element we have seen before
-we should note that we need return the indices of the two numbers
-This means we need to keep truck of element and indices
    -we can create a HashMap to map 'element -> index'
-For each of the element 'x
-This approach will allow us to reduce the time complexity to  0(n)

***Answer

-Create a HashMap 'map' to keep truck of element and index
-Iterate through the indices of the input array 'nums', denoted as 'i'
    - If 'map' contains 'target - nums[i]'
     -Return{i, map.get(target-nums[i]}
     -Put 'nums[i]' and 'i' into 'map'
     -Return an empty array

     What is the time and space complexity?
     Time Complexity - O(N), where n is the length of the input array
     - 0(n), because visit each index once
     Space Complexity - (n), where n is the length of the input array
     -O(n), map
 */
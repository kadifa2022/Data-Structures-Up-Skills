import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int [] nums){
        Set<Integer> set = new HashSet<>();

        for(int i =0; i <nums.length; i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

        }

        return false;
    }
}

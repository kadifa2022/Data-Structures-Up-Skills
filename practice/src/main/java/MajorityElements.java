import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String[] args) {

        int [] array = {2,3,2,2,1,1,2,2};

        System.out.println(majorityElement(array));

    }

    public static int majorityElement(int [] nums){

        int count =0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int each : nums) {
            if(map.containsKey(each)){
                map.put(each, map.get(each) + 1);
            }else{
                map.put(each,1);
            }
            if(map.get(each) > nums.length/2){
                return each;
            }

        }
        return -1;
    }


}

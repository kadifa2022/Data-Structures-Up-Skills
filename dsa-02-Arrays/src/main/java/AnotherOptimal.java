import java.util.Arrays;

public class AnotherOptimal {

    public static void main(String[] args) {
        int [] nums = {17,2,3,4,7,9,15,16};
        int target = 9;
        int [] ind = new int[2];

        // sort method here
        for(int i = 0, j =1; i<nums.length; i++, j++){//O(N)
            if(nums[i]>target){//constant
                continue;
            }
            if(target-nums[i] == nums[j]){//constant
                ind[0]=i; ind [1]=j;
                System.out.println(Arrays.toString(ind));
            }//overall complexity will be nlogn+n
        }
    }
}

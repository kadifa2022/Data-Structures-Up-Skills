public class RemoveDupMoreThanTwoFromSortedArray_80 {

    public static void main(String[] args) {

        int [] nums = {0,0,0,0,1,1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int [] nums){

        // Base case

        int L = 0, R = 1,  Counter = 0;
        int N = nums.length;

        while(R < N){
            if(nums[L] == nums[R] && Counter == 0){
                nums[++L] = nums[R++];
                Counter ++;
            }else if (nums[L] == nums[R] && Counter ==1){
                R++;
            }else if(nums[L] !=nums[R]){
                nums[++L] =nums[R++];
                Counter=0;
            }
        }
        return L +1;
    }

}

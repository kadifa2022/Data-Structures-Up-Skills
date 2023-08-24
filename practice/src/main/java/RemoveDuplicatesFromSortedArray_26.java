public class RemoveDuplicatesFromSortedArray_26 {

    public static void main(String[] args) {

        int [] nums = {0,1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums){

        int L = 0, R =1;
        int N = nums.length;
        //L<=R
        while(R < N){
            if(nums[L] == nums[R]){
                R++;
            }else if(nums[L] != nums[R]){
                nums[++L] = nums[R];
            }

        }
        return L+ 1;// (last non dup element's index)+1
    }

}

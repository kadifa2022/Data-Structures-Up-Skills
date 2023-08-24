public class RemoveDuplicatesFromSortedArray_LeetCode_80 {

    public static void main(String[] args) {
        int [] nums ={0,0,1,1,1,1,2,3,3,5};

        System.out.println(removeDuplicates(nums));

    }

    // remove duplicates if appear more than twice
    // we will use two pointer left, right
public static int removeDuplicates(int [] nums) {

        // define base case
    int n = nums.length;
     if(n < 3) return n;

     // define pointers and counter
     int L = 0, R = 1, Counter = 0;
    // remove dup
     while(R< n){
         if(nums[L] != nums[R]){
             L++;
             nums[L] =nums[R];
             Counter =0;
         }else if (nums[L] == nums[R] && Counter < 1){
             Counter ++;
             nums[++L] =nums[R];
         }
         R++;
     }

    // return length
    return  L +1;


}

}
/*
0,0,1,1,1,1,2,3,3
 ^ ^  pointers
 L R

 counter = 0 start // if the value equals to each other than we increase counter

 */
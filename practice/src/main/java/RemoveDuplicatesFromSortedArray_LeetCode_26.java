import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_LeetCode_26 {

    public static void main(String[] args) {

        int [] nums = {0,1,1,2};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {

        // first we are defining Base Case
        int n = nums.length;
        if (n < 2)
            return n; // making sure there is no duplicates if is less than 2

        // define pointers
        int L = 0, R = 1;

        //remove dup in place
        while (R < n) {// we are focusing to exploring
            if (nums[L] != nums[R]) { // if 1 != 2 //we moved left pointer to right
                L++;
                nums[L] = nums[R]; // comparing
            }
            R++;        // we increased right pointer to right
            //return size of subarray
        }

        return L + 1;
    }
}

/*
modifying array // we are not creating another array
L- pointer represents unique element
R- pointer and->  left pointer equal right pointer that point to
[1,1,2]input : sorted array : will use two pointers
[1,2,1] output - does not matter what is after 1,2 ..


 */
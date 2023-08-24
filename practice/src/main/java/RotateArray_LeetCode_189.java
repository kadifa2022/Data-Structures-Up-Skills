import java.util.Arrays;

public class RotateArray_LeetCode_189 {
    public static void main(String[] args) {

        int [] nums = {1,2,2,2,3,3};

    }

    public  void rotateArray(int[] nums, int k){

        k = k % nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k,nums.length-1);
    }

    public  void reverse(int [] array, int start, int end){
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end--;
        }


    }






}

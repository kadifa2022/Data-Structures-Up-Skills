public class RemoveElement_27 {

    public static void main(String[] args) {
        int [] nums= {3,2,2,3};

        System.out.println(removeElement(nums,3));

    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {// find element that is not equal to val
                nums[count] = nums[i];
                count++;
            }

        }
        return count;
    }

}
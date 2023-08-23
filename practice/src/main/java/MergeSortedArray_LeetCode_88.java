import java.util.Arrays;

public class MergeSortedArray_LeetCode_88 {

    public static void main(String[] args) {
        int [] nums1= {1,2,3,0,0,0};
        int [] nums2={2,5,6};



    }

    public static void merge(int[] nums1,int m,int [] nums2, int n ){

        int count = 0;

        while(m<nums1.length){
            nums1[m] = nums2[count];
            count++;
            m++;
        }
        Arrays.sort(nums1);

    }

}

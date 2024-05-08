public class MergeSortedArray_88 {
    public static void main(String[] args) {
       int [] nums1 = {1,2,3,0,0,0};
       int [] nums2 = {2,5,6};
       int p1 = 3;
       int p2 = nums2.length;


        int [] mergedArray= mergeSortedArrays(nums1,p1,  nums2,p2);
        // print the merged array
        for(int num : mergedArray){
            System.out.print(num + "");
        }


    }
    public static int  [] mergeSortedArrays(int [] nums1, int m, int [] nums2, int n){
       // int [] array = new int[]{};

        int p1=m-1, p2=n-1, i = m + n-1;

        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--] = nums1[p1--];
            } else{
                nums1[i--]=nums2[p2--];
            }
        }
        return nums1;

    }

}

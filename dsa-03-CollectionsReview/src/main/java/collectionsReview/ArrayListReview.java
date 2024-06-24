package collectionsReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {
        //Convert an Array to ArrayList with Arrays.asList()
        // two different ways to convert array  to list
        Integer [] arr = {1,2,3,4,5,5};
        List<Integer> list = Arrays.asList(arr);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        // Convert an Array to ArrayList with Collections.addAll()
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, arr);
        System.out.println(list3);

        // Convert an ArrayList to the Array
        List<Integer> nums = new ArrayList<Integer>();

        Integer [] arr2 = nums.toArray( new Integer[0]);
        //converting an ArrayList to Array with stream()
        int[] arr3 = nums.stream().mapToInt(i->i).toArray();
    }
}

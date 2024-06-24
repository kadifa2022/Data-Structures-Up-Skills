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

        Collections.addAll(list, arr);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReview2 {

    public static void main(String[] args) {

        //convert an Array to arrayList with Array.asList()
        Integer [] arr = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        //Convert an Array to ArrayList with collections.addAll()
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, arr);



    }
}

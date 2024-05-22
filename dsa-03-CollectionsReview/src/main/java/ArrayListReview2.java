import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReview2 {

    public static void main(String[] args) {

        //convert an Array to arrayList with Array.asList()
        Integer [] arr = {2,6,7,1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        //Convert an Array to ArrayList with collections.addAll()
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, arr);
        System.out.println(list3);

        //Convert an ArrayList to Array
        List<Integer> nums = new ArrayList<Integer>();
        Integer[] arr1 = nums.toArray(new Integer[0]);

        //Converting an ArrayList to Array using Stream()
        int  [] array = list.stream().mapToInt(i->i).toArray();

        // Sort without comparator Complexity n(log n)
        Collections.sort(list2);
        //for reverse order
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);





    }
}

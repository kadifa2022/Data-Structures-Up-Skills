import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int givenArray []={1,2,3,4,5};

        System.out.println(Arrays.toString(reverse(givenArray)));
    }

    public static int [] reverse(int [] arr){
        int j =0;
        int [] newArr= new int[arr.length];

        // for loop
        for (int i = arr.length-1; i >= 0 ; i--) {

            newArr [j] = arr [i];
            j++;



        }
      return  newArr;


    }
}

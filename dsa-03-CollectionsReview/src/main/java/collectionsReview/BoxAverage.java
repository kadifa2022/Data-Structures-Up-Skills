package collectionsReview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BoxAverage {
    public static void main(String[] args) throws IOException {
        // Input [uncomment & modify if required]
        ArrayList<Integer> ans = new ArrayList<>(); // input as arrayList, we will provide
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().trim();
        while (S.equals("FULL") == false) { // will stop reading the values from the screen
            // if is not equals to "FULL" will parseInt to integer
            ans.add(Integer.parseInt(S));
            S = br.readLine().trim();
        }
        System.out.println(boxAverage(ans));

    }


    public static int boxAverage(ArrayList<Integer> ans) {
        // this is default OUTPUT. You can change it and add() s to array
        int result = -404;
        // initialize min and max value
        int min = ans.get(0);// at least we have one element
        int max = ans.get(0);//
        //loop find min and max
        for (Integer an : ans) {
            if (an > max) max = an;
            else if (an > min) min = an;
        }
        //return the average of min and max
        result = (int) Math.ceil((double) (min + max) / 2);
        return result;

    }
}
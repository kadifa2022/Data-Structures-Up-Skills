import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BoxAverage {
    public static void main(String[] args) throws IOException {
        //input (uncomment and modify if required)
        ArrayList<Integer> ans = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        while (s.equals("FULL") == false){
            ans.add(Integer.parseInt(s));
            s = br.readLine().trim();
        }
      System.out.println(boxAverage(ans));
    }
    public static int boxAverage(ArrayList<Integer> ans){
        // this is default OUTPUT. You can change it.
        int result = -400;
        // initialize min and max
        int min = ans.get(0);
        int max = ans.get(0);
        //loop find min and max
        for (Integer an : ans){
            if(an>max) max = an;
            else if(an<min)  min= an;
        }

        //return the average of min and max
        result = (int) (Math.ceil((double) min + max)/2);

        return result;
    }
}

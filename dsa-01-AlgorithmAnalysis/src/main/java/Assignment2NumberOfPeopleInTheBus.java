import java.util.ArrayList;

public class Assignment2NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]>busStop= new ArrayList<int[]>();
        busStop.add(new int[]{10,0});
        busStop.add(new int[]{3,5});
        busStop.add(new int[]{2,5});
        System.out.println(countPassengers(busStop));

    }



    public static int countPassengers(ArrayList<int[]>stops){

        //Runs in O(n) complexity because there is a single loop with size n
        int numOfPeople=0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople=numOfPeople + stops.get(i)[0]-stops.get(i)[1];

        }
        return numOfPeople;
    }

}

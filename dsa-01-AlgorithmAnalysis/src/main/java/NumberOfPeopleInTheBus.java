import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList <int []> busStops = new ArrayList<>();
        busStops.add(new int []{10,1});
        busStops.add(new int []{3,5});
        busStops.add(new int []{2,5});
        System.out.println(countPassengers(busStops));

    }
    public static int countPassengers(ArrayList<int [] >stops){
        // Runs in O(n) complexity because there is a single loo with size n
        int numOfPeople = 0;
        for(int i=0; i < stops.size(); i++){
            numOfPeople = numOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }
        return numOfPeople;
    }
}

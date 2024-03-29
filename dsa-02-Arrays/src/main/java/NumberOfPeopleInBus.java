import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumberOfPeopleInBus {
    public static void main(String[] args) {
        ArrayList<int []> busStops = new ArrayList<int[]>();
        busStops.add(new int[] {10,0}); //first stop
        busStops.add(new int[] {23,5});
        busStops.add(new int[]{2,5});//last stop

        System.out.println(countPassengers(busStops));
    }

    public static int countPassengers(ArrayList<int []> stops){

        int numOfPeople= 0;
        for(int i = 0; i<stops.size(); i++){
            numOfPeople = numOfPeople + stops.get(i) [0] - stops.get(i) [1];
        }
        return numOfPeople;

    }

}

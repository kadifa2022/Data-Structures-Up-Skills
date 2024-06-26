package collectionsReview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.toList;

public class LetterCandles {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read input here
        System.out.println("Enter letter count: ");
        int letterCount = Integer.parseInt(reader.readLine());
        System.out.println("Enter number of candles that ca be removed");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Enter candles letters: ");
        String letters = reader.readLine();
        System.out.println(letterCandlesCost(letterCount, m, letters));

    }
    public static int letterCandlesCost(int letterCount, int m, String str){
        int cost = 0; // defining cost
        //create hashmap
        Map<Character, Integer> map = new HashMap<>();
        // calculate frequencies
        int count = 0;
        for(Character ch: str.toCharArray()) {// converting string to char array
            if (map.containsKey(ch)) {// if map contains character
                count = map.get(ch);// get the character and assign to  count
                map.put(ch, count++);// and put in the map
            } else map.put(ch, 1);
        }
        //get values and sort them in desc order
        List<Integer> letterFreq = map.values()
                .stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(toList());

       // minimize cost//(i need to decrease the highest degree number of freq and assign to Index
        int index = 0; // starting frequencies from begin of the list
        while(m>0 && index<letterFreq.size()-1){
            if(letterFreq.get(index)>= letterFreq.get(index+1)){
                letterFreq.set(index, letterFreq.get(index) -1);
                m--;
            } else if(index > 0 && letterFreq.get(index)< letterFreq.get(index -1)) index --;
                else index++;

            }
        // calculate minimize cost
        for (Integer num : letterFreq) {
            cost += num + num;
        }
        return cost;
    }
}
/*
 create hashmap
1. find the frequencies (sample from: first non repeating character)
2. minimize the  cost and sort(in desc order), get values and sort them
3. started  to decrease the greatest number in the list(n value will be decreased)
 and assigning Index to do this with while loop
4. create while loop and starting from very beginning of the list to get the frequencies,
while m is greater than zero and index should be less than letter frequencies size -1
if(letter frequency.get(index) is greater and equal


 */

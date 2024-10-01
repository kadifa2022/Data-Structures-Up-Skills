package arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LetterCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Read inputs here

        System.out.println("Enter letter count: ");
        int letterCount = Integer.parseInt(reader.readLine());
        System.out.println("Enter number candles that can be removed: ");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Enter candle letters : ");
        String letters =reader.readLine();
        System.out.println(letterCandles(letterCount,m, letters));

    }
    //find and store the frequency
    //Sort frequencies in desc (hashMap sort on values)
    //decrease number letters  (of the larges # to the smallest)
    public static int letterCandles(int letterCount, int m, String str){
        int cost =0;
        //create hashMap
        //O(n<26)
        Map<Character, Integer> map = new HashMap<>();
        int count;
     //calculate frequency
        //O(n)
        for(Character ch: str.toCharArray()){
            if(map.containsKey(ch)){
               count= map.get(ch);
               map.put(ch, count++);
            }else map.put(ch,1);
        }
        //n logn n is not grater than 26
        List<Integer> letterFrequency= map.values().stream().sorted((o1,o2)->o2.compareTo(o1))
                .collect(Collectors.toList());
        int index=0;
        // minimize  cost
        //o(n) n is not crater than 26 in fact it is constant
        while(m>0 && index<= letterFrequency.size() -1){
            if(m>0 && letterFrequency.size() ==1){
                letterFrequency.set(0, letterFrequency.get(0)-1);
                m--;
            }else if (letterFrequency.get(index)>= letterFrequency.get(index+1)){
                letterFrequency.set(index, letterFrequency.get(index)-1);
                m --;
            }else if(index>0 && letterFrequency.get(index)< letterFrequency.get(index-1)) index --;
            else index++;
        }//o(m=26 at most o(1)
        //calculate min cost
        //O(n) n is not >26
        for(Integer num : letterFrequency){
            cost +=num + num;
        }
        //return result o(n)
        return cost;
    }




}

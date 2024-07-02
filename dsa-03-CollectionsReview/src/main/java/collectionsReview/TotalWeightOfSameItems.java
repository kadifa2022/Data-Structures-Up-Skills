package collectionsReview;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TotalWeightOfSameItems {
    public static void main(String[] args) {
        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};

        System.out.println(mergeSimilarItems(items1, items2));
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int [][]items2){
        // return type
        List<List<Integer>> result = new ArrayList<>();
        // create TreeMap for ascending order
        TreeMap<Integer, Integer>  map = new TreeMap<>();
        // add items1 to the treeMap
        for(int[] item: items1){
            map.put(item[0], item[1]);
        }
        //add items2 into treemap, if no entry then add item first then update it
        for(int[] item: items2){
            map.putIfAbsent(item[0], 0);
            map.put(item[0], map.get(item[0]) + item[1]);
        }
        // go over the treemap and add key and value (weight)into a list and add list into result list:
        for (var item : map.keySet()) {
            List<Integer> row = new ArrayList<>();
            row.add(item);
            row.add(map.get(item));
            result.add(row);
        }
        return result;
    }
}

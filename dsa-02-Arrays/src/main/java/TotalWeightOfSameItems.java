import java.util.ArrayList;
import java.util.List;

import java.util.TreeMap;

public class TotalWeightOfSameItems {//MergeSameItems
    public static void main(String[] args) {

        int [][] items1= {{1,1,},{4,5},{3,8}};
        int [][] items2 = {{3,1},{1,5}};

        System.out.println(mergeSimilarItems(items1,items2));
    }
    public static List<List<Integer>> mergeSimilarItems (int[][] items1, int [][] items2){
        List<List<Integer>> result = new ArrayList<>(); //return type
        //create tree map
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        // add items1 in tree map
       for (int[] item:items1) {
           treeMap.put(item[0], item[1]);
       }
        // add items2 in tree map, if no entry then add item first than update it
        for (int[] item : items2) {
            treeMap.putIfAbsent(item[0], 0);
            treeMap.put(item[0],treeMap.get(item[0])+ item[1]);
        }
        // go over the treemap, add key and value(weight) into a list and list into result list
        for(var item: treeMap.keySet()){
            List<Integer> row = new ArrayList<>();
            row.add(item);
            row.add(treeMap.get(item));
            result.add(row);
        }

        return result;
    }
}

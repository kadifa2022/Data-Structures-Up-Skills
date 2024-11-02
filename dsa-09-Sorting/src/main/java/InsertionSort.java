public class InsertionSort { // the size of input data is reduced at each step

    public static int [] insertionSort(int[] array){
        for(int i = 1; i< array.length; i++){// iterate from array[1] to array[N] over the array
             int toBeInserted = array[i]; // temp var toBeInserted// save ith value
            int j = i-1; // this is predecessor // start from i-1 (predecessor)
            // start shifting operation here
            while (j>= 0 && toBeInserted <array[j]){ // go back and compare until ith< array[j]
                array[j+1] = array[j];// shifting operation here
                j--;

            }
            array[j+1] = toBeInserted;
        }
        return array;
    }

}

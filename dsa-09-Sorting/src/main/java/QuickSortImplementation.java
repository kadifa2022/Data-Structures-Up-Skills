public class QuickSortImplementation {
    public static void quickSort(int[] array, int start, int end){
        if(start>= end) return; //termination
        // start with boundary (boundary is the element in the middle of the partition)
        int boundary = partition(array, start, end);
        quickSort(array,start,boundary -1);// call quickSort for left part
        quickSort(array, boundary +1, end);// call quickSort for right part

        }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int boundary = start;
        for(int i = start; i<= end; i++){
            if(array[i]<=pivot) swap (array, i, boundary++);
    }
        return boundary -1;
}

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

public class ExponentialSearch {
    public static int exponentialSearch(int[]array, int data){
        int bound = 1;
        while(bound<array.length && array[bound] < data) bound*=2;// if my data is not in bound i double the bound
        int left = bound/2; // made search between left and right element
        int right=Math.min(bound, array.length -1);
        return BinarySearch.binarySearchRecursive(array, data, left, right); // called BinarySearchRecursive method
    }

}

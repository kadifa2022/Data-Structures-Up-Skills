public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }
    }

    public static int binarySearchIterative(int [] array, int data){
        // initial left and right pointers
        int left = 0;
        int right = array.length-1;

        while(left<= right){// pointers can't cross each other<= to stop if is equal
            int middle= (left+ right) /2;
            if(array[middle]==data) return middle;
            if(data <array[middle]) right = middle-1; // changing right index
            else left = middle +1;
        }
        return -1;
    }
}
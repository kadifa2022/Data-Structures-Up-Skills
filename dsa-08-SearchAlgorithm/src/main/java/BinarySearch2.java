public class BinarySearch2 {
    public static void main(String[] args) {

    }
    public int search(int [] array, int data){
        int left =0;
        int right = array.length-1;

        while(left<=right){                 //(left + right) /2 know from my java that will be automatically cast to the integer
            int middle = (left + right )/ 2; // for bindery search we need to calculate middle  value
            if(array[middle] == data) return middle; //i found the data
            else if(data < array[middle]) right = middle -1; // left portion
            else left = middle +1; // move left pointer to the right

        }
   return -1; // if i can't find anything return -1
    }

// Ternary Search-Similar to Binary search, instead of two parts Ternary search divides into 3 parts
}

public class Search2DMatrix {

    public static void main(String[] args) {
        // number of colum:  [0,         1,           2]   matrix[0].length
        int[][] matrix = {{1,3,5,7}, {10,11,16,20},{23,30,34,60}};
        // number of rows: m
        System.out.println(searchMatrix(matrix,61));
        System.out.println(searchMatrixLogNM(matrix, 1));
    }
    public static boolean searchMatrix(int[][] matrix, int target){ //O(m)
        // numbers of row and columns
        int numberOfCols =matrix[0].length;
        int numberOfRows = matrix.length;
        // calculate  right block
        int currentRow = 0;
        while(currentRow < numberOfRows-1){
            if(target > matrix[currentRow] [numberOfCols-1]) currentRow++;
            else break;
        }
        // maka a binary search in block  O(log n)
        int left = 0;
        int right = numberOfCols -1;
        while(left<=right){
            int mid = (left + right)/2;
            if(target == matrix[currentRow] [mid]) return true;
            else if(target<matrix[currentRow][mid]) right = mid-1;
            else left = mid +1;
        }
        return false;
    }
    // here we are modifying to O(m*n)
    public static boolean searchMatrixLogNM(int [][] matrix, int target){
        int numberOfCols = matrix[0].length;
        int numberOfRows = matrix.length;
        int left = 0;
        int right = numberOfRows * numberOfCols -1;
        while(left<=right){
            int midIndex = (left + right) /2;
            // rows and columns from index number
            int row = midIndex/numberOfCols;
            int col = midIndex%numberOfCols;
            // get value from matrix
            int midValue = matrix[row][col];
            if (target == midValue) return true;
            else if(target<midValue) right= midIndex -1;
            else left= midIndex +1;

        }
        return false;
    }
}

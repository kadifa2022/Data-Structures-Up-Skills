public class JumpSearch {
    public static int jumpSearch(int[] array, int data){
        int blockSize = (int)Math.sqrt(array.length);
            int start = 0;
            int next = blockSize;
            // looking for right block
            while(start<array.length && array[next-1]<data){
                start = next;
                next +=blockSize;
                if(next>array.length) next = array.length;
            } // linear search
            for(int i = start; i < next; i++){
                if(array[i] ==data) return i;
            }
            return -1; // if we don't find it return -1;
        }

}

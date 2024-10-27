public class MyTree {

    // need just root
    TNode root;
    public MyTree(){ // NoArgsConstructor

    }
    void insert(int value){// start with root
        TNode newNode = new TNode(value); //TN assign with value new TNode

        if(root == null){
            root = newNode;
            return;
        }

    }
    //Task 1: Implement finding an integer value in a BST(binary search tree)
    boolean contains(int value){
        if(root == null ) return false;
        // i need to re-start my starting point
        TNode current = root;
        while(current != null){
            // first case: value is less than current value
            if(value < current.value) current = current.rightChild;
            // second case: value is greater thn current value
            else if (value > current.value) current = current.rightChild;
            // third case: return true
            else return  true;
        }
        return false;


    }

    //Task 2: Implement a method that returns true if the node is a leaf in a BST.
    //Task 3: Implement a method that prints leaves of a BST

}

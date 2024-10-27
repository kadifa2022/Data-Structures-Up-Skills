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

    }

    //Task 2: Implement a method that returns true if the node is a leaf in a BST.
    //Task 3: Implement a method that prints leaves of a BST

}

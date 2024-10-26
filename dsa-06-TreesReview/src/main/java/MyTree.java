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

}

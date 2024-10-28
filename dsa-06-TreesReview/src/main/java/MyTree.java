import org.w3c.dom.Node;

public class MyTree {

    // need just root
    TNode root;
    public MyTree(){ // NoArgsConstructor

    }
    void insert(int value) {//start with root with void
        TNode newNode = new TNode(value);//TN assign with value new TNode

        if (root == null) {//if root is null //root is new node
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {//compared value
            if (value <= current.value) {//value can  be less than value

                if (current.leftChild == null) {//another check
                    // if left is null insert there!!
                    current.leftChild = newNode;
                    break;
                }//if leftChild is notnull branch into left subtree
                current = current.leftChild;//assign
            } else {//value is grater than current value

                if (current.rightChild == null) {
                    //if right is null insert there!!

                    current.rightChild = newNode;//inserted child
                    break;
                }//if leftChild is notnull branch into right subtree
                current = current.rightChild;
            }
        }
    }
//    void insert(int value){// start with root
//        TNode newNode = new TNode(value); //TN assign with value new TNode
//
//        if(root == null){
//            root = newNode;
//            return;
//        }
//
//    }
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
    boolean isLeaf(TNode node){
        return node.leftChild == null && node.rightChild == null;
    }
    //Task 3: Implement a method that prints leaves of a BST
    void  printLeaves(TNode root){
        if(root == null) return;
        if(isLeaf(root)) System.out.println(root.value + " , ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }
    //Task 4: Implement a method that calculate height of a Node of a BST
    int heightOfTheNode(TNode root){//height method we need to calculate balance factor
        // if root is null return -1
        if(root == null) return -1;
        // if leaf return 0
        if(isLeaf(root)) return 0;
        //else return 1 +  max of heights of left and right subtree
        return 1 + Math.max(heightOfTheNode(root.leftChild), heightOfTheNode(root.rightChild));

    }

    //Task 5: Implement a method that counts leaves of a BST
    int countLeaves(TNode root){
        //root return null
        if(root == null) return 0;
        // isLeaf return 1
        if(isLeaf(root)) return 1;
        // collect count
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }
    //Task 6: Implement a method that returns sum of the leaf values of a BST
    int findSumOfLeaves(TNode root){
        if(root == null) return 0;
        if(isLeaf(root)) return root.value;
        return  findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }

    //Task 7: Implements a method that returns sum of Node values of a BST
    int nodeSums(TNode root){
        if(root == null) return 0;
        return root.value + nodeSums(root.leftChild) + nodeSums(root.rightChild);

    }


}

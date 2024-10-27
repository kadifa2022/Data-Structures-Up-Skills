package Review_Trees_Part1;

import java.util.LinkedList;
import java.util.Queue;

public class TreeClass {
// variables created from the classes are NULL by default.

    TreeNode root;
    public TreeClass() {// default constructor
         // why default is null?  Reference types? null.
    }
     public void insert(TreeNode newNode){
        // tree can be empty and first thing we need to check
         if(root == null){
             root = newNode;
             return;
         }
         TreeNode current = root;
         while(true){
             if(newNode.id <= current.id ){
                 if(current.leftChild == null){
                     //make insertion
                     current.leftChild = newNode;// if left child is null where you cannot branch left
                     break;
                 }
                 current = current.leftChild; // if left child is not null branch left
             }else{
                 if(current.rightChild == null ){
                     // make insertion if right is not null where you cannot branch right
                     current.rightChild = newNode;
                     break;
                 }
                 current=current.rightChild;// if right child is not null branch right
             }
         }
    }

    void preOrderTraversal(TreeNode root){
        if(root == null) return; //termination
        System.out.println(root.name); //visit/perform operation root node
        preOrderTraversal(root.leftChild);  //recursive visit left subtree
        preOrderTraversal(root.rightChild); //recursive visit right subtree

    }
    void preOrderTraversalIterative(TreeNode root){



    }
    void inOrderTraversal(TreeNode root){// ascending order
        if(root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.name);
        inOrderTraversal(root.rightChild);

    }
    void postOrderTraversal(TreeNode root){
        if(root == null) return;
        postOrderTraversal(root.rightChild);
        postOrderTraversal(root.leftChild);
        System.out.println(root.name);

    }

    void levelOrderTraversal(){
        if (root == null) return;
        // if we have elements we need QUEUE
        Queue< TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode toVisit= queue.poll();
            System.out.println(toVisit.name);
            if(toVisit.leftChild !=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild !=null) queue.add(toVisit.rightChild);

        }

    }



}

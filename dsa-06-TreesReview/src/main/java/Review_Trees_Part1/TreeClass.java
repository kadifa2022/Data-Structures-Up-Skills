package Review_Trees_Part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        // check if root is null
        if(root == null )return;
        // create stack and push starting point to the stack than children
        Stack<TreeNode> stack = new Stack<>();
        // push root to the stack
        stack.push(root);
        //while  loop(until stack is empty
        while(!stack.isEmpty()) {
            //pop stack
            TreeNode poppedNode = stack.pop();
            // print popped node
            System.out.println(poppedNode.name + " , ");
            // push popped node children into stack(rightChild first than left
            if(poppedNode.rightChild!=null) stack.push(poppedNode.rightChild);
            if(poppedNode.leftChild != null) stack.push(poppedNode.leftChild);

        }

    }
    void inOrderTraversal(TreeNode root){// ascending order
        if(root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.println(root.name);
        inOrderTraversal(root.rightChild);

    }
    void inOrderTraversalIterative(TreeNode root){
        if(root == null) return; // termination
        Stack< TreeNode >stack = new Stack<>();
        TreeNode current = root;
        //Traverse tree
         while(current !=null || !stack.isEmpty()){
             // find left most node in tree
             while(current != null){
             // push node before to stack branching left
                 stack.push(current);
                 current = current.leftChild;
             }// current is null now
             current = stack.pop();
             System.out.println(current.name + " , ");
             // now it's right child turn
             current = current.rightChild;
            // end of while loop
         }


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

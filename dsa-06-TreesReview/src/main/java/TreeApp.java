

public class TreeApp {

    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};

        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null, false);
        //tree.printLeaves(tree.root);
        System.out.println();// height method we need to calculate balance factor
        System.out.println(tree.heightOfTheNode(tree.root.leftChild));

        // System.out.println(tree.contains(8));
//
//        tree.preOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("In Order Traversal:");
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("Post Order Traversal: ");
//        tree.postOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("Level Order Traversal: ");
//        tree.levelOrderTraversal();
//

//        System.out.println(tree.contains(8));//call three methode
//        tree.printLeaves(tree.root);
//        System.out.println();
//


        System.out.println();
        System.out.println("Height of the tree is:" + tree.heightOfTheNode(tree.root));
         System.out.println("Number of leaves:" + tree.countLeaves(tree.root));
        System.out.println("Sum of leaf Nodes: " + tree.findSumOfLeaves(tree.root));
        System.out.println("Sum of all Nodes: " + tree.nodeSums(tree.root));
//
//        System.out.println("Sum of Node Depth :" + tree.calculateNodeDepthSums());
//        System.out.println("Sum of all node value is:" + tree.calculateNodeSums());

    }
}
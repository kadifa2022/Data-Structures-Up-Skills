package Review_Trees_Part1;

public class TreeApp {
    public static void main(String[] args) {
        TreeClass tree = new TreeClass();
        System.out.println(tree.root);
        tree.insert(new TreeNode("John", "Black", 5));
        tree.insert(new TreeNode("Carol", "Lock", 3));
        tree.insert(new TreeNode("Mike", "white", 6));
        tree.insert(new TreeNode("Memo", "Quick", 4));
//        tree.preOrderTraversal(tree.root);
//        System.out.println();
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//        tree.postOrderTraversal(tree.root);
        tree.levelOrderTraversal();

    }
}

package Review_Trees_Part1;

public class TreeNode { // how to create tree node
    // Data
    String name;
    String lastName;
    int id;



    TreeNode leftChild;   // reference for the left child
    TreeNode rightChild;  //reference for the right child

    public TreeNode(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }



}

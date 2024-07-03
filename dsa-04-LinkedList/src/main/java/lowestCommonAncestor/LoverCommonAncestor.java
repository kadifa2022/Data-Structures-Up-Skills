package lowestCommonAncestor;

public class  LoverCommonAncestor {
    public static void main(String[] args) {

       // System.out.println(lowestCommonAncestor());

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if(p.val<root.val && q.val<root.val){
            return lowestCommonAncestor(root.left, p,q);
        }
        if(p.val> root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p,q);
        }
        return root;
    }
}

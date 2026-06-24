package WEEK4.Day3;

public class Lowest_common_ancestor_of_BST {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(6);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(4);
        root.left.right.left=new TreeNode(3);
        root.left.right.right=new TreeNode(5);
        root.right=new TreeNode(8);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(9);
        TreeNode ans=lowestCommonAncestor(root,root.left,root.right);
        System.out.println(ans.val);
    }    
}

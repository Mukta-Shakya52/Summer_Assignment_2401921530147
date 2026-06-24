package WEEK4.Day3;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val,TreeNode left, TreeNode right){
        this.val=val;
        this.left = left;
        this.right = right;
    }
}
public class Validate_binary_search_tree {
    public static boolean isValidBST(TreeNode root) {
        return traversal(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private static boolean traversal(TreeNode root, long min, long max){
        if(root==null) return true;
        if(root.val <= min || root.val >= max){
            return false;
        }
        return traversal(root.left,min,root.val) && traversal(root.right,root.val,max);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.right.left=new TreeNode(3);
        root.right.right=new TreeNode(6);
        System.out.println(isValidBST(root));
    }
}

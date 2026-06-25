package WEEK4.Day4;
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
public class Binary_tree_maximum_path_sum {
    static int max=Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    public static int dfs(TreeNode root){
        if(root==null) return 0;
        int leftval=Math.max(0,dfs(root.left));
        int rightval=Math.max(0,dfs(root.right));
        int curr=root.val+leftval+rightval;
        max=Math.max(max,curr);
        return root.val+Math.max(leftval,rightval);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(maxPathSum(root));
    }
}

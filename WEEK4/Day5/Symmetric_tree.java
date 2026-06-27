package WEEK4.Day5;
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
public class Symmetric_tree {
    public static boolean isSymmetric(TreeNode root){
        if(root==null) return true;
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        return (t1.val==t2.val) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
}


/*

         1
       /   \
      2     2
    /  \   /  \
   3   4   4   3
   
 */
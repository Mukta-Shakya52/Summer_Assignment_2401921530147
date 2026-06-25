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
public class Diameter_of_binary_tree {
    static int diameter=0;
    public static int diameterOfBinaryTree(TreeNode root){
        
        level(root);
        return diameter;
    }
    public static int level(TreeNode root){
        if(root==null) return 0;
        int l=level(root.left);
        int r=level(root.right);
        diameter=Math.max(diameter,l+r);
        return 1+Math.max(l,r);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        System.out.println(diameterOfBinaryTree(root));
    }
    
}

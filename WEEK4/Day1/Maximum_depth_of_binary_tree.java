package WEEK4.Day1;

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
public class Maximum_depth_of_binary_tree {
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode (9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);       
        int maximum=maxDepth(root);
        System.out.println("The maximum depth of binary tree is: "+maximum);
    }
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}

/*
        3
      /   \
     9     20
          /  \
         15   7
         
*/

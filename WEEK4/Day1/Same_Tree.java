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
public class Same_Tree {
    public static void main(String[] args){
        TreeNode root1=new TreeNode (1);
        root1.left=new TreeNode(2);
        root1.right=new TreeNode(3);

        TreeNode root2=new TreeNode (1);
        root2.left=new TreeNode(2);
        root2.right=new TreeNode(3);
        System.out.println(isSameTree(root1,root2));
    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val != q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}


/*
      1                1
    /   \            /   \
  2       3        2       3

*/
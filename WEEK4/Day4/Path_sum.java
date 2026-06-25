package WEEK4.Day4;

import java.util.Scanner;

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
public class Path_sum {
    public static boolean hasPathSum(TreeNode root,int target){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            return target==root.val;
        }
        return hasPathSum(root.left,target-root.val) || hasPathSum(root.right,target-root.val);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right=new TreeNode(8);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.right=new TreeNode(1);
        System.out.println("enter the target: ");
        int target=sc.nextInt();
        System.out.println(hasPathSum(root,target));
        sc.close();
    }
}

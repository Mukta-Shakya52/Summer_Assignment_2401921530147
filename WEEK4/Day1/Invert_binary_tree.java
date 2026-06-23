package WEEK4.Day1;

import java.util.LinkedList;
import java.util.Queue;

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
public class Invert_binary_tree {
    public static void main(String[] args){
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(9);
        invertTree(root);
        levelOrder(root);
    }
    public static TreeNode invertTree(TreeNode root){
        if(root==null) return null;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static void levelOrder(TreeNode root){
        if(root==null){
        return;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        TreeNode curr = q.remove();
        System.out.print(curr.val + " ");
        if(curr.left != null) q.add(curr.left);
        if(curr.right != null) q.add(curr.right);
    }
    }
}

/*
        4
      /   \
     7     2
    / \   / \
   9  6  3   1
   
*/

package WEEK4.Day2;

import java.util.ArrayList;
import java.util.List;

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
public class Binary_tree_inorder_traversal {
    public static void inorder(TreeNode root,List<Integer>result){
        if(root==null){
            return;
        }
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        List<Integer>result=new ArrayList<>();
        inorder(root,result);
        System.out.println(result);
    }
}

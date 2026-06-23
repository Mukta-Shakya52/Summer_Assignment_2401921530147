package WEEK4.Day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
public class Binary_tree_level_order_traversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>a1=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode ele=q.poll();
                a1.add(ele.val);
                if(ele.left!=null) q.offer(ele.left);
                if(ele.right!=null) q.offer(ele.right);
            }
            ans.add(a1);
        }
        return ans;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(levelOrder(root));
    }
}

/*
        3
       / \
      9   20
         /  \
        15   7

 */

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
public class Binary_tree_zigzag_level_order_traversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(root,ans,0);
        return ans;
    }
    private static void dfs(TreeNode root,List<List<Integer>> ans,int level){
        if(root==null) return;
        if(ans.size()==level){
            ans.add(new ArrayList<>());
        }
        if(level%2==0){
            ans.get(level).add(root.val);
        }
        else{
            ans.get(level).add(0,root.val);
        }
        dfs(root.left,ans,level+1);
        dfs(root.right,ans,level+1);
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(zigzagLevelOrder(root));
    }
}

/*
        3
       / \
      9   20
         /  \
        15   7
        
 */
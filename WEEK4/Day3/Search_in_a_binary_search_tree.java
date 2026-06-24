package WEEK4.Day3;
import java.util.*;
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
public class Search_in_a_binary_search_tree {
    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val==val){
            return root;
        }
        if(val<root.val){
            return searchBST(root.left,val);
        }
        return searchBST(root.right,val);
    }
    public static void Display(TreeNode root){
        if(root==null){
            return;
        }
        
        System.out.print(root.val+" ");
        Display(root.left);
        Display(root.right);
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(7);
        System.out.println("Enter the value: ");
        int val=sc.nextInt();
        TreeNode result=searchBST(root,val);
        if(result!=null){
            System.out.println("SOLUTION: ");
            Display(result);
        }
        else{
            System.out.println("Not found");
        }
        sc.close();
    }   
}

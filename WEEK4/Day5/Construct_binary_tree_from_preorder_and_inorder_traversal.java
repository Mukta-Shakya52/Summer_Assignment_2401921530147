package WEEK4.Day5;

import java.util.HashMap;
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
public class Construct_binary_tree_from_preorder_and_inorder_traversal {
    static int preindex=0;
    static HashMap<Integer,Integer> map=new HashMap<>();
    public static TreeNode buildTree(int[] preorder, int[] inorder){
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);
    }
    public static TreeNode build(int[]preorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootVal=preorder[preindex++];
        TreeNode root=new TreeNode(rootVal);
        int val=map.get(rootVal);
        root.left=build(preorder,start,val-1);
        root.right=build(preorder,val+1,end);
        return root;
    }
    public static void display(TreeNode root) {
        if (root==null)
            return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args){
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        Scanner sc=new Scanner(System.in);
        System.out.println("size of preorder: ");
        int pre=sc.nextInt();
        int[]preorder=new int[pre];
        System.out.println("enter preorder: ");
        for(int i=0;i<pre;i++){
            preorder[i]=sc.nextInt();
        }
        System.out.println("size of inorder: ");
        int in=sc.nextInt();
        int[]inorder=new int[in];
        System.out.println("enter inorder: ");
        for(int i=0;i<in;i++){
            inorder[i]=sc.nextInt();
        }
        TreeNode head=buildTree(preorder,inorder);
        display(head);
        sc.close();
    }
}

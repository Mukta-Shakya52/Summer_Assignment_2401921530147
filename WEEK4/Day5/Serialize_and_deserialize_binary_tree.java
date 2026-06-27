package WEEK4.Day5;

import java.util.ArrayList;
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
public class Serialize_and_deserialize_binary_tree {
    public static String serialize(TreeNode root) {
        if (root == null) return "[]";
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode curr=q.poll();
            if (curr==null) {
                list.add("null");
            }
            else {
                list.add(String.valueOf(curr.val));
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }
        int i=list.size()-1;
        while(i>=0 && list.get(i).equals("null")) {
            list.remove(i);
            i--;
        }
        return "[" + String.join(",", list) + "]";
    }
    public static void funcserialize(TreeNode root,StringBuilder sb){
        if(root==null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        funcserialize(root.left,sb);
        funcserialize(root.right,sb);
    }
    public static TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        Queue<String> q=new LinkedList<>();
        for(String str:arr){
            q.offer(str);
        }
        return build(q);
    }
    public static TreeNode build(Queue<String> q){
        String ele=q.poll();
        if(ele.equals("null")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(ele));
        root.left=build(q);
        root.right=build(q);
        return root;
    }
    public static void main(String[] args){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        System.out.println("Input: root = " + serialize(root));
        TreeNode newRoot = deserialize("1,2,null,null,3,4,null,null,5,null,null,");
        System.out.println("Output: " + serialize(newRoot));
    }
}

package WEEK3.Day2;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Remove_nth_node_from_end_of_list {
    public static Node removeNthFromEnd(Node head,int n){
        if(head==null || n<=0){
            return head;
        }
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            if(fast==null){
                return head;
            }
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of linked list: ");
        int n=sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            Node node=new Node(x);
            if(head==null){
                head=tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
        System.out.println("Enter the position: ");
        int n1=sc.nextInt();
        head=removeNthFromEnd(head,n1);
        display(head);
        sc.close();
    }
}

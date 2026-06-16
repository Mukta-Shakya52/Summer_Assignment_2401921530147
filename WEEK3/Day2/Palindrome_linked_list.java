package WEEK3.Day2;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Palindrome_linked_list {
    public static boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondHalf=reverse(slow.next);
        Node first=head;
        Node second=secondHalf;
        while(second!=null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
    }
    public static Node reverse(Node head){
        if(head==null){
            return head;
        }
        Node after=null;
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
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
        boolean answer=isPalindrome(head);
        System.out.println(answer);
        sc.close();
    }
}

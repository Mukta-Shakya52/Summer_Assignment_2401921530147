package WEEK3.Day2;

import java.util.Scanner;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Merge_two_sorted_list {
    public static Node mergeTwoLists(Node head1,Node head2){
        Node copy=new Node(-1);
        Node last=copy;
        while(head1!=null && head2!=null){
            if(head1.val <= head2.val){
                last.next=head1;
                head1=head1.next;
            }
            else{
                last.next=head2;
                head2=head2.next;
            }
            last=last.next;
        }
        if(head1!=null){
            last.next=head1;
        }
        else{
            last.next=head2;
        }
        return copy.next;
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
        System.out.println("Enter the size of first linked list: ");
        int n1=sc.nextInt();
        Node head1=null;
        Node tail1=null;
        for(int i=0;i<n1;i++){
            int x=sc.nextInt();
            Node node1=new Node(x);
            if(head1==null){
                head1=tail1=node1;
            }
            else{
                tail1.next=node1;
                tail1=node1;
            }
        }

        System.out.println("Enter the size of second linked list: ");
        int n2=sc.nextInt();
        Node head2=null;
        Node tail2=null;
        for(int j=0;j<n2;j++){
            int y=sc.nextInt();
            Node node2=new Node(y);
            if(head2==null){
                head2=tail2=node2;
            }
            else{
                tail2.next=node2;
                tail2=node2;
            }
        }
        Node head=mergeTwoLists(head1,head2);
        display(head);
        sc.close();
    }
}

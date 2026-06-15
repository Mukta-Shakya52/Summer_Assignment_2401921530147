package WEEK3.Day1;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Reverse_linked_list {
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
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);

        head=reverse(head);
        display(head);
    }
}

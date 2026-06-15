package WEEK3.Day1;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Middle_of_the_linked_list {
    public static Node middle_delete(Node head){
        if(head==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
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
        head.next.next.next.next.next=new Node(6);
        head=middle_delete(head);
        display(head);
    }
}

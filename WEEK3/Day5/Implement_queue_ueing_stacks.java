package WEEK3.Day5;
import java.util.*;
class MyQueue{
    Stack<Integer> st=new Stack<>();
    Stack<Integer> helper=new Stack<>();

    public void push(int x){
        st.push(x);
    }
    public int pop(){
        peek();
        return helper.pop();

    }
    public int peek(){
        if(helper.isEmpty()){
            while(!st.isEmpty()){
                helper.push(st.pop());
            }
        }
        return helper.peek();
    }
    public boolean empty(){
        return (st.isEmpty() && helper.isEmpty());
    }
}
public class Implement_queue_ueing_stacks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MyQueue obj=new MyQueue();
        sc.close();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());

        obj.push(4);
        System.out.println(obj.empty());
    }
    
}

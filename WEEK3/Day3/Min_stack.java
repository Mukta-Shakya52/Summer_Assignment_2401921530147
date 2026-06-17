package WEEK3.Day3;
import java.util.*;
class MinStack{
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack(){
        st=new Stack<>();
        minStack=new Stack<>();
    }
    public void push(int val){
        st.push(val);
        if(minStack.size()==0 || val<minStack.peek()){
            minStack.push(val);
        } 
        else{
            minStack.push(minStack.peek());
        }
    }
    public void pop(){
        if(!st.isEmpty()){
            st.pop();
            minStack.pop();
        }

    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return minStack.peek();
    }

}
public class Min_stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MinStack obj=new MinStack();
        System.out.println("Enter the number of strings in an character array: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            String op=sc.next();
            switch(op){
                case "push":
                    int val=sc.nextInt();
                    obj.push(val);
                    System.out.println("Pushed value: "+val);
                    break;
                case "pop":
                    obj.pop();
                    System.out.println("Element is popped");
                    break;
                case "top":
                    System.out.println("Top element of the stack is: "+obj.top());
                    break;
                case "getMin":
                    System.out.println("Minmum element is: "+obj.getMin());
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        sc.close();
    }
}

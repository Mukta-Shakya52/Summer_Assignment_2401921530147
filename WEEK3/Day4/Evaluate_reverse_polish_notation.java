package WEEK3.Day4;
import java.util.*;
public class Evaluate_reverse_polish_notation {
    public static int evalRPN(String[] token){
        Stack<Integer> st=new Stack<>();
        
        int answer=0;
        for(String t:token){
            if(t.equals("+")){
                int a=st.pop();
                int b=st.pop();
                answer=a+b;
                st.push(answer);
            }
            else if(t.equals("-")){
                int a=st.pop();
                int b=st.pop();
                answer=b-a;
                st.push(answer);
            }
            else if(t.equals("*")){
                int a=st.pop();
                int b=st.pop();
                answer=a*b;
                st.push(answer);
            }
            else if(t.equals("/")){
                int a=st.pop();
                int b=st.pop();
                answer=b/a;
                st.push(answer);
            }
            else{
                st.push(Integer.parseInt(t));
            }
        }       
        return st.pop();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the String containing numbers and operators in the array: ");
        String [] token=new String[n];
        for(int i=0;i<n;i++){
            token[i]=sc.next();
        }
        int answer=evalRPN(token);
        System.out.println(answer);
        sc.close();
    }
}

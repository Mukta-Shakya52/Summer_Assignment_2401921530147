package WEEK3.Day3;
import java.util.*;
public class Valid_parenthesis {
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top=st.peek();
                if(sameChar(top,ch)){
                    st.pop();
                }
                else return false;
            }
        }
        return (st.isEmpty());
    }
    public static boolean sameChar(char a, char b){
            if(a=='(' && b==')'){
                return true;
            }
            if(a=='[' && b==']'){
                return true;
            }
            if(a=='{' && b=='}'){
                return true;
            }
            return false;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string containg just the characters '(', ')', '{', '}', '[' and ']': ");
        String s=sc.nextLine();
        boolean answer=isValid(s);
        System.out.println(answer);
        sc.close();
    }
}

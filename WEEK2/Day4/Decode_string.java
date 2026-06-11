package WEEK2.Day4;
import java.util.Scanner;
import java.util.Stack;

public class Decode_string {
    public static String decodeString(String s){
        Stack<Integer> count=new Stack<>();
        Stack<StringBuilder> stc=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int n=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }
            else if(ch=='['){
                count.push(n);
                stc.push(curr);
                n=0;
                curr=new StringBuilder();
            }
            else if(ch==']'){
                int again=count.pop();
                StringBuilder prev=stc.pop();
                for(int i=0;i<again;i++){
                    prev.append(curr);
                }
                curr=prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=sc.nextLine();
        String answer=decodeString(s);
        System.out.println("Decoded string is: "+answer.toString());
        sc.close();
    }
    
}

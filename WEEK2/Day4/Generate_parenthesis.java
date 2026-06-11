package WEEK2.Day4;
import java.util.*;
public class  Generate_parenthesis{
    public static List<String> generateParenthesis(int n){
        List<String> answer=new ArrayList<>();
        func(answer,"",0,0,n);
        return answer;
    }
    public static void func(List<String> answer,String s,int open,int close,int n){
        if(s.length()==2*n){
            answer.add(s);
            return;
        }
        if(open<n){
            func(answer,s+"(",open+1,close,n);
        }
        if(close<open){
            func(answer,s+")",open,close+1,n);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        List<String> answer=generateParenthesis(n);
        for(String s:answer){
            System.out.print(s+" ");
        }
        sc.close();
    }
    
}

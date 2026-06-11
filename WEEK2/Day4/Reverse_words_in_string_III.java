package WEEK2.Day4;
import java.util.*;
public class Reverse_words_in_string_III {
    public static String reverseWords(String str){
        String[] val=str.split(" ");
        StringBuilder answer=new StringBuilder();
        for(String s:val){
            StringBuilder sb=new StringBuilder(s);
            answer.append(sb.reverse()).append(" ");
        }
        return answer.toString().strip();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        String answer=reverseWords(str);
        System.out.println("Reversed String: "+answer);
        sc.close();
    }
    
}

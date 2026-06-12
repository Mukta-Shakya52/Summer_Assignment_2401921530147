package WEEK2.Day5;
import java.util.*;
public class Longest_palindromic_substring {
    static int max=0;
    static int start=0;
    static int end=0;
    public static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s){
        int l=s.length();
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(isPalindrome(s,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        String answer=longestPalindrome(s);
        System.out.println("Longest palindromic substring is: "+answer);
        sc.close();
    }
    
}

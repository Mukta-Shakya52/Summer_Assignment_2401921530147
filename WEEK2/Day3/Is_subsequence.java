package WEEK2.Day3;

import java.util.Scanner;

public class Is_subsequence {
    public static boolean isSubsequence(String s,String t){
        int i=0;
        int j=0;
        while(s.length()>1 && t.length()>j){
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        return i==s.length();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first=sc.nextLine();
        System.out.println("Enter second string: ");
        String second=sc.nextLine();
        boolean answer=isSubsequence(first,second);
        System.out.println(answer);
        sc.close();
    }
    
}

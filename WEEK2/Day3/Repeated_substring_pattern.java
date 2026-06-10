package WEEK2.Day3;

import java.util.Scanner;

public class Repeated_substring_pattern {
    public static boolean repeatedSubstringPattern(String s){
        String twice=s+s;
        return twice.substring(1,twice.length()-1).contains(s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        boolean answer=repeatedSubstringPattern(str);
        System.out.println(answer);
        sc.close();
    }
}

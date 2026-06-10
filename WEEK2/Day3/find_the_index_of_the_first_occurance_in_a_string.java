package WEEK2.Day3;

import java.util.Scanner;

public class find_the_index_of_the_first_occurance_in_a_string {
    public static int strStr(String haystack, String needle){
        int l1=haystack.length();
        int l2=needle.length();
        for(int i=0;i<=l1-l2;i++){
            int j=0;
            while(j<l2 && haystack.charAt(i+j)==needle.charAt(j)){
                j++;
            }
            if(j==l2){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first=sc.nextLine();
        System.out.println("Enter second string: ");
        String second=sc.nextLine();
        int answer=strStr(first,second);
        System.out.println(answer);
        sc.close();
    }
    
}

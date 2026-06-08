package WEEK2.Day1;
import java.util.*;
public class First_unique_character_in_a_string {
    public static int firstUniqueChar(String str){
        int[]freq=new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        int answer=firstUniqueChar(str);
        System.out.println(answer);
        sc.close();
    }
}

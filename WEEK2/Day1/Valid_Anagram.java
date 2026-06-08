package WEEK2.Day1;
import java.util.*;
public class Valid_Anagram {
    public static boolean isAnagram(String first, String second){
        if(first.length()!=second.length()) return false;
        char[] one=first.toCharArray();
        char[] two=second.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        for(int i=0;i<one.length;i++){
            if(one[i]!=two[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first=sc.nextLine();
        System.out.println("Enter second string: ");
        String second=sc.nextLine();
        boolean answer=isAnagram(first,second);
        System.out.println("String is an anagram: "+answer);
        sc.close();
    }
    
}

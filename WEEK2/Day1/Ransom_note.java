package WEEK2.Day1;
import java.util.*;
public class Ransom_note {
    public static boolean canConstruct(String ransomNote, String magazine){
        int[] val=new int[26];
        for(int i=0;i<magazine.length();i++){
            val[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            val[ransomNote.charAt(i)-'a']--;
            if(val[ransomNote.charAt(i)-'a']<0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ransomNote: ");
        String ransomNote=sc.nextLine();
        System.out.println("Enter string magazine: ");
        String magazine=sc.nextLine();
        boolean answer=canConstruct(ransomNote,magazine);
        System.out.println(answer);
        sc.close();
    }
}

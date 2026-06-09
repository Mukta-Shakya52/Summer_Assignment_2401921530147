package WEEK2.Day2;
import java.util.Arrays;
import java.util.Scanner;

public class Permutation_in_string {
    public static boolean checkInclusion(String s1,String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        int[]freq=new int[26];
        int[]arr=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,arr)) return true;
        for(int i=s1.length();i<s2.length();i++){
            arr[s2.charAt(i)-'a']++;
            arr[s2.charAt(i-s1.length())-'a']--;
            if(Arrays.equals(freq,arr)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=sc.nextLine();
        System.out.println("Enter second string: ");
        String s2=sc.nextLine();
        boolean answer=checkInclusion(s1, s2);
        System.out.println("Is one of s1's permutations is the substring of s2: "+answer);
        sc.close();
    }
    
}

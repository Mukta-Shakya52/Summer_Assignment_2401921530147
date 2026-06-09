package WEEK2.Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Find_all_anagrams_in_a_string {
    public static List<Integer> findAnagrams(String s,String p){
        List<Integer> answer=new ArrayList<>();
        if(p.length()>s.length()) return answer;
        int []freq=new int[26];
        int []arr=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,arr)){
            answer.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(freq,arr)){
                answer.add(i-p.length()+1);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s=sc.nextLine();
        System.out.println("Enter second string: ");
        String p=sc.nextLine();
        List<Integer> answer=findAnagrams(s,p);
        System.out.println(answer);
        sc.close();
    }
    
}

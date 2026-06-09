package WEEK2.Day2;
import java.util.*;
public class Longest_substriing_without_repeating_characters {
    public static int lengthOfLongestSubstring(String str){
        int right=0;int left=0;int res=0;
        Map<Character,Integer>map=new HashMap<>();
        char[] a = str.toCharArray();
        for(right=0;right<a.length;right++){
            int index=map.getOrDefault(a[right],-1);
            if(index!=-1 && index>=left){
                res=Math.max(res,right-1-left+1);
                left=index+1;
            }
            map.put(a[right],right);
        }
        return Math.max(res,right-1-left+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        int answer=lengthOfLongestSubstring(str);
        System.out.println("The length of longest substring is: "+answer);
        sc.close();
    }
}

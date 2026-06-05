package WEEK1.Day5;
import java.util.Scanner;
public class Valid_Palindrome {
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(str.charAt(left))) left++;;
            while(left<right && !Character.isLetterOrDigit(str.charAt(right))) right--;
            if(Character.toLowerCase(str.charAt(left))!= Character.toLowerCase(str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        boolean answer=isPalindrome(str);
        System.out.println("The given string is a palindrome: "+answer);
        sc.close();
    }
}

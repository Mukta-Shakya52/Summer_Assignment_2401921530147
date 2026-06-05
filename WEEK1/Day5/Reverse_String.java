package WEEK1.Day5;
import java.util.Scanner;
public class Reverse_String {
    public static void reverseString(char [] str){
        int l=str.length;
        int i=0;
        int j=l-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        char [] s=str.toCharArray();
        reverseString(s);
        for(char x:s){
            System.out.print(x+" ");
        }
        sc.close();
    }
    
}

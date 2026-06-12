package WEEK2.Day5;
import java.util.*;
public class String_compression {
    public static int compress(char [] chars){
        int l=chars.length;
        int k=0;
        for(int i=0;i<l;i++){
            char ch=chars[i];
            int count=0;
            while(i<l && chars[i]==ch){
                i++;
                count++;
            }
            chars[k++]=ch;
            if(count>1){
                String ct=String.valueOf(count);
                for(char c:ct.toCharArray()){
                    chars[k++]=c;
                }
            }
            i--;
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int answer=compress(arr);
        System.out.println("After modifying the input array in-place, the first character of chars should be: "+answer);
        sc.close();
    }
    
}

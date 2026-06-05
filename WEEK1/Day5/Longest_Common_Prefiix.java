package WEEK1.Day5;
import java.util.*;
public class Longest_Common_Prefiix {
    public static String LCP(String[] str){
        StringBuilder st=new StringBuilder();
        Arrays.sort(str);
        char[]first=str[0].toCharArray();
        char[]last=str[str.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]) break;
            st.append(first[i]);
        }
        return st.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        String[] arr=new String[n];
        System.out.println("Enter the strings: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String answer=LCP(arr);
        System.out.println(answer);
        sc.close();
    }
    
}

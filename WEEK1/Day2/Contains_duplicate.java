package WEEK1.Day2;
import java.util.Arrays;
import java.util.Scanner;
public class Contains_duplicate {
    public static boolean containsDupe(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean answer=containsDupe(arr);
        System.out.println("Contains Duplicate: "+answer);
        sc.close();
    }
}

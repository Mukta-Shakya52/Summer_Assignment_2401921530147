package WEEK1.Day3;
import java.util.Scanner;
public class Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int []arr){
        int []answer=new int[arr.length];
        int i=0;
        int j=arr.length-1;
        int k=arr.length-1;
        while(i<=j){
            int val1=arr[i]*arr[i];
            int val2=arr[j]*arr[j];
            if(val1 > val2){
                answer[k]=val1;
                i++;
            }
            else{
                answer[k]=val2;
                j--;
            }
            k--;
        }
        return answer;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements in an array: ");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]answer=sortedSquares(arr);
        for(int x:answer){
            System.out.print(x+" ");
        }
        sc.close();
    }
}


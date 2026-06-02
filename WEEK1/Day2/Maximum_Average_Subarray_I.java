package WEEK1.Day2;

import java.util.Scanner;

public class Maximum_Average_Subarray_I {
    public static double Average_function(int[] arr,int k){
        int sum_k=0;
        for(int i=0;i<k;i++){
            sum_k=sum_k+arr[i];
        }
        int max_sum=sum_k;
        for(int i=k;i<arr.length;i++){
            sum_k=sum_k+arr[i]-arr[i-k];
            max_sum=Math.max(max_sum,sum_k);
        }
        return (double) max_sum/k;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("exter the size of array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        double answer=Average_function(arr,k);
        System.out.println("Maximum Average of Subarray is: "+answer);
    }
}

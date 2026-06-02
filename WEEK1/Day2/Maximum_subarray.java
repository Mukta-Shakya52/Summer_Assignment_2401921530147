package WEEK1.Day2;

import java.util.Scanner;

public class Maximum_subarray {
    public static int maxSubArray(int [] arr){
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
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
        int answer=maxSubArray(arr);
        System.out.println("The largest sum is: "+answer);
        sc.close();
    }
}

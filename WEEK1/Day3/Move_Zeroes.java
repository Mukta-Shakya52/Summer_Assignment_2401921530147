package WEEK1.Day3;

import java.util.Scanner;

public class Move_Zeroes {
    public static void moveZeroes(int[] arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[ans]=arr[i];
                ans++;
            }
        }
        while(ans<n){
            arr[ans]=0;
            ans++;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr);
        sc.close();
    }
    
}

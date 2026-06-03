package WEEK1.Day3;
import java.util.Scanner;
public class Container_with_most_water {
    public static int maxArea(int[] height){
        int i=0;
        int j=height.length-1;
        int max_water=0;
        while(i<j){
            int width=j-1;
            int h=Math.min(height[i],height[j]);
            max_water=Math.max(max_water,width*h);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return max_water;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int []height=new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int answer=maxArea(height);
        System.out.println("Maximum amount of water a conatiner can store is: "+answer);
        sc.close();
    }
    
}

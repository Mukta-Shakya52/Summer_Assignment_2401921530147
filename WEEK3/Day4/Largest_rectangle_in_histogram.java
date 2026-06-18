package WEEK3.Day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Largest_rectangle_in_histogram {
    public static int largestRectangleArea(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int[] a=new int[n];
        int[] b=new int[n];
        Arrays.fill(a,-1);
        Arrays.fill(b,-1);
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                int index=st.pop();
                a[index]=i;  
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            a[st.pop()]=n;
        }
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[i] < heights[st.peek()]){
                int index=st.pop();
                b[index]=i;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            b[st.pop()]=-1;
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int width=a[i]-b[i]-1;
            int area=heights[i]*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sie of the array: ");
        int n=sc.nextInt();
        int[] heights=new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i=0; i<n; i++) {
            heights[i]=sc.nextInt();
        }
        int answer=largestRectangleArea(heights);
        System.out.println("Area of the largest rectangle in the histogram is: "+answer);
        sc.close();
    }
}

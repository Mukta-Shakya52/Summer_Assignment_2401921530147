package WEEK3.Day3;
import java.util.*;
public class Next_greater_element {
    public static int[] nextGreaterElement(int[] nums1, int[]nums2){
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[nums1.length];
        for(int n:nums2){
            while(!st.isEmpty() && n > st.peek()){
                map.put(st.pop(),n);
            }
            st.push(n);
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of first array: ");
        int n1=sc.nextInt();
        int[]nums1=new int[n1];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of second array: ");
        int n2=sc.nextInt();
        int[]nums2=new int[n2];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n2;i++){
            nums2[i]=sc.nextInt();
        }

        int[] result=nextGreaterElement(nums1,nums2);
        System.out.println("Resultant Array: ");
        for(int ele:result){
            System.out.print(ele+" ");
        }
        sc.close();
    }
    
}

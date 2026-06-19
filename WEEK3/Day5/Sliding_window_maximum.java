package WEEK3.Day5;
import java.util.*;
public class Sliding_window_maximum {
    public static int[] maxSlidingWinding(int[] nums,int k){
        Deque<Integer> dq=new LinkedList<>();
       int val=0;
       int n=nums.length;
       int [] answer=new int[n-k+1];
       for(int i=0;i<n;i++){
        while(!dq.isEmpty() && dq.peekFirst()<=i-k){
            dq.pollFirst();
        }
        while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
            dq.pollLast();
        }
        dq.offerLast(i);
        if(i>=k-1){
            answer[val++]=nums[dq.peekFirst()];
        }
       }
       return answer;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of window: ");
        int k=sc.nextInt();
        int [] answer=maxSlidingWinding(arr,k);
        for(int ele: answer){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}

package WEEK3.Day4;
import java.util.*;
public class Daily_temperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        int n=temperatures.length;
        int [] answer=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int index=st.pop();
                answer[index]=i-index;
            }
            st.push(i);
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
        int[] answer=dailyTemperatures(arr);
        for(int ele:answer){
            System.out.print(ele+" ");
        }
        sc.close();
    }
}

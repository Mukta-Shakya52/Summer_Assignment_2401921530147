import java.util.Scanner;

public class two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i=0; i<n; i++) {
            for (int j =i+1; j<n; j++) {
                if (nums[i]+nums[j]==target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] answer=twoSum(arr,target);
        if (answer.length==2) {
            System.out.println(answer[0] + " " + answer[1]);
        } else {
            System.out.println("No solution found");
        }
        sc.close();
    }
}
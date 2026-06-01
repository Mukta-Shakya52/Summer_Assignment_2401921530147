import java.util.Scanner;

public class Remove_duplicates_from_sorted_array{
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n==0) {
            return 0;
        }
        int k = 1;
        for (int i=1;i<n; i++) {
            if (nums[i]!=nums[i-1]) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int k =removeDuplicates(arr);
        System.out.println("give Number of unique elements: " + k);
        System.out.print("New Array after removing duplicates: ");
        for (int i=0; i<k; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}



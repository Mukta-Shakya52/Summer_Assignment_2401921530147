import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int maxP=0;
        for (int i=0; i<prices.length; i++) {
            if (prices[i]<minP) {
                minP=prices[i];
            }

            int profit=prices[i]-minP;
            if (profit>maxP) {
                maxP=profit;
            }
        }
        return maxP;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for (int i=0; i<n; i++) {
            prices[i]=sc.nextInt();
        }
        int result=maxProfit(prices);
        System.out.println("Maximum Profit earned is: "+result);
        sc.close();
    }
}

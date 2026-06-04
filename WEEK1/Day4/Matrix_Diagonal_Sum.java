package WEEK1.Day4;
import java.util.Scanner;
public class Matrix_Diagonal_Sum {
    public static int diagonalSum(int[][]matrix){
        int length=matrix.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum=sum+matrix[i][i];
            sum=sum+matrix[i][length-1-i];
        }
        if(length%2==1){
            sum=sum-matrix[length/2][length/2];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n=sc.nextInt();
        
        int[][]matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int answer=diagonalSum(matrix);
        System.out.println("The sum of the diagonals of a matrix are: "+answer);
        sc.close();
    }
    
}

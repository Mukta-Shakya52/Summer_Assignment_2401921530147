package WEEK1.Day4;
import java.util.*;
public class Spiral_Matrix {
    public static List<Integer> spiralOrder(int[][]matrix){
        List<Integer> answer=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int start_row=0;
        int end_row=m-1;
        int start_col=0;
        int end_col=n-1;
        while(start_row <= end_row && start_col <= end_col){
            for(int j=start_col;j<=end_col;j++){
                answer.add(matrix[start_row][j]);
            }
            for(int i=start_row+1;i<=end_row;i++){
                answer.add(matrix[i][end_col]);
            }
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row == end_row) break;
                answer.add(matrix[end_row][j]);
            } 
            for(int i=end_row-1;i>start_row;i--){
                if(start_col==end_col) break;
                answer.add(matrix[i][start_col]);
            }
            start_row++;
            end_row--;
            start_col++;
            end_col--;
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows in matrix: ");
        int m=sc.nextInt();
        System.out.println("Enter the columns in matrix: ");
        int n=sc.nextInt();
        int [][]matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> answer=spiralOrder(matrix);
        for(int x:answer){
            System.out.print(x+" ");
        }
        sc.close();
    }
}

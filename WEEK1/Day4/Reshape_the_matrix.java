package WEEK1.Day4;
import java.util.Scanner;
public class Reshape_the_matrix {
    public static int[][] matrixReshape(int[][]matrix,int r,int c){
        int m=matrix.length;
        int n=matrix[0].length;
        if(m*n != r*c) return matrix;
        int [][]answer=new int[r][c];
        for(int i=0;i<m*n;i++){
            answer[i/c][i%c]=matrix[i/n][i%n];
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n=sc.nextInt();
        int[][]matrix=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the row in which you want to reshape: ");
        int r=sc.nextInt();
        System.out.println("Enter the column in which you want to reshape: ");
        int c=sc.nextInt();
        int [][]result=matrixReshape(matrix,r,c);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

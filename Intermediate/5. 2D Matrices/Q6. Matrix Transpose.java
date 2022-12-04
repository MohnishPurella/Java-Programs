import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        You are given a matrix A, you have to return another matrix which is the transpose of A.

        NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row.
        The tranpose of a matrix switches the element at (i, j)th index to (j, i)th index,
        and the element at (j, i)th index to (i, j)th index.

        Input:
        1 2 3
        4 5 6
        7 8 9

        Output:
        1 4 7
        2 5 8
        3 6 9
        */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for(int row = 0; row<n; row++){
            for (int col = 0; col<m; col++){
                a[row][col] = scn.nextInt();
            }
        }
        int ans[][] = solve(a);
        for(int row = 0; row<ans.length; row++){
            for (int col = 0; col<ans[0].length; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] A) {
        int transposeMatrix[][] = new int[A.length][A[0].length];
        for(int i=0 ;i<transposeMatrix.length;i++){
            for (int j=0 ; j<transposeMatrix[0].length;j++){
                transposeMatrix[i][j]=A[j][i];
            }
        }
        return transposeMatrix;
    }


}

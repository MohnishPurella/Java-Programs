import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M).
        You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

        If A and B are two matrices of the same order (same dimensions).
        Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element
        wise subtraction of A from B.

        Return a 2D matrix denoting A - B.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int A[][] = new int[n][m];
        int B[][] = new int[n][m];
        for(int row = 0; row<n; row++){
            for(int col=0; col<m; col++){
                A[row][col] = scn.nextInt();
            }
        }
        for(int row = 0; row<n; row++){
            for(int col=0; col<m; col++){
                B[row][col] = scn.nextInt();
            }
        }
        int ans[][] = solve(A,B);
        for(int row = 0; row<ans.length; row++){
            for(int col=0; col<ans[0].length; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] A, int B[][]) {
        int subArr[][] = new int[A.length][A[0].length];
        for(int row = 0; row<A.length; row++){
            for (int col = 0; col<A[0].length; col++){
                subArr[row][col] = A[row][col] - B[row][col];
            }
        }
        return subArr;
    }
}


import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        You are given two matrices A & B of equal dimensions and you have
        to check whether two matrices are equal or not.
        NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j in the given range.
        Return 1 if both matrices are equal or return 0.
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
        System.out.print(solve(A,B));
    }

    private static int solve(int[][] A, int B[][]) {
        for(int row = 0; row<A.length; row++){
            for (int col = 0; col<A[0].length; col++){
                if(A[row][col]!=B[row][col]){
                    return 0;
                }
            }
        }
        return 1;
    }
}


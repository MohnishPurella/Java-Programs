import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
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
        int sumArr[][] = new int[A.length][A[0].length];
        for(int row = 0; row<A.length; row++){
            for (int col = 0; col<A[0].length; col++){
                sumArr[row][col] = A[row][col] + B[row][col];
            }
        }
        return sumArr;
    }
}


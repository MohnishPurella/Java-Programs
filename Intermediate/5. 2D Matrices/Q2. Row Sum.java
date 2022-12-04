import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

                [1,2,3,4]
         A =    [5,6,7,8]
                [9,2,3,4]

         Output = [10,26,18]

         Explanation:
            Row 1 = 1+2+3+4 = 10
            Row 2 = 5+6+7+8 = 26
            Row 3 = 9+2+3+4 = 18
         */
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
        int a[][] = new int[row][column];
        for(int i=0 ;i<row;i++){
            for (int j=0; j<column; j++){
                a[i][j] = scn.nextInt();
            }
        }
        int ans[] = solve(a);
        for(int i=0 ;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] solve(int[][] A) {
        int colSumArr[] = new int[A.length];
        for(int row = 0; row<A.length; row++){
            int sum = 0;
            for(int col=0; col<A[0].length; col++){
                sum+=A[row][col];
            }
            colSumArr[row] = sum;
        }
        return colSumArr;
    }
}
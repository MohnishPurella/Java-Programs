import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.

                [1,2,3,4]
         A =    [5,6,7,8]
                [9,2,3,4]

         Output = [15,10,13,16]

         Explanation:
            Column 1 = 1+5+9 = 15
            Column 2 = 2+6+2 = 10
            Column 3 = 3+7+3 = 13
            Column 4 = 4+8+4 = 16
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
        int colSumArr[] = new int[A[0].length];
        for(int row = 0; row<A[0].length; row++){
            int sum = 0;
            for(int col=0; col<A.length; col++){
                sum+=A[col][row];
            }
            colSumArr[row] = sum;
        }
        return colSumArr;
    }
}

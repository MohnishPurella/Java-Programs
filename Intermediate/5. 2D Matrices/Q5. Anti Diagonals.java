import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
            Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

            Output Format:
            Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
            The vacant spaces in the grid should be assigned to 0.

            Input:
            1 2 3
            4 5 6
            7 8 9

            Output:
            1 0 0
            2 4 0
            3 5 7
            6 8 0
            9 0 0
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
        int ans[][] = diagonal(a);
        for(int row = 0; row<ans.length; row++){
            for (int col = 0; col<ans[0].length; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] diagonal(int[][] A) {
        int diagArr[][] = new int[2*A.length-1][A.length];
        int r=0,c=0;
        for(c=0; c<A[0].length; c++){
            int i=r, j=c;
            while(i<A.length && j>=0){
                diagArr[c][i] = A[i][j];
                i++;
                j--;
            }
        }
        c=A[0].length-1;
        int row_index = A[0].length;
        for( r=1; r<A.length; r++){
            int i=r, j=c;
            int col_index = 0;
            while(i<A.length && j>=0){
                diagArr[row_index][col_index] = A[i][j];
                i++;
                j--;
                col_index++;
            }
            row_index++;
        }
        return diagArr;
    }
}

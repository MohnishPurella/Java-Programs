import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
        Specifically, make entire ith row and jth column zero.

        A = 1 2 3 4
            5 6 7 0
            9 2 0 4

        Output = 1 2 0 0
                 0 0 0 0
                 0 0 0 0

        A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for(int row= 0 ;row<n; row++){
            for(int col=0; col<m; col++){
                a[row][col] = scn.nextInt();
            }
        }
        int ans[][] = solve(a);
        for(int row= 0 ;row<ans.length; row++){
            for(int col=0; col<ans[0].length; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] A) {
        int outarr[][]=new int[A.length][A[0].length];

        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                outarr[i][j]=A[i][j];
            }
        }
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {

                if(A[i][j]==0)
                {
                    for(int k=0;k<A[0].length;k++) // row vals are 0 now
                    {
                        outarr[i][k]=0;
                    }
                    for(int k=0;k<A.length;k++) // ool vals are 0 now
                    {
                        outarr[k][j]=0;
                    }
                }
            }
        }

        return outarr;
    }
}

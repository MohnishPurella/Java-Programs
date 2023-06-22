import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.

        Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such
        that i + j = M + 1 (where i, j are 1-based).

         A =    [1, -2, -3]
                [-4, 5, -6]
                [-7, -8, 9]

        Output : -5

        Explanation :
            A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
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
        System.out.print(solve(a));
    }

    private static int solve(int[][] A) {
        int sum = 0;
        for(int row = 1; row<=A.length; row++){
            for(int col = 1; col<=A[0].length; col++){
                if(row+col == A.length+1){
                    sum+=A[row-1][col-1];
                }
            }
        }
        return sum;
    }
}

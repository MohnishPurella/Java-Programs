import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.

        Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

        n = 3 m = 3
               [1 -2 -3]
        A =    [-4 5 -6]
               [-7 -8 9]

        ans =  15

        A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
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
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[][] A) {
        int sum = 0;
        for(int row = 0; row<A.length; row++){
            sum+=A[row][row];
        }
        return sum;
    }
}

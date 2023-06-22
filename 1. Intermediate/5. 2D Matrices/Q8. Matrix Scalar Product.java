import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        You are given a matrix A and and an integer B, you have to perform
        scalar multiplication of matrix A with an integer B.

        Input:
        A = 1 2 3
            4 5 6
            7 8 9
        B = 2

        OutPut:
            2 4 6
            8 10 12
            14 16 18

         Explaination:
            ==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
            ==> [[2*1, 2*2, 2*3],[2*4, 2*5, 2*6],[2*7, 2*8, 2*9]]
            ==> [[2, 4, 6], [8, 10, 12], [14, 16, 18]]
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int A[][] = new int[n][m];
        for(int row = 0; row<n; row++){
            for(int col=0; col<m; col++){
                A[row][col] = scn.nextInt();
            }
        }
        int b = scn.nextInt();
        int ans[][] = solve(A,b);
        for(int row = 0; row<ans.length; row++){
            for(int col=0; col<ans[0].length; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] A, int B) {
        for(int row = 0; row<A.length; row++){
            for (int col = 0; col<A[0].length; col++){
                A[row][col]=A[row][col] * B;
            }
        }
        return A;
    }
}


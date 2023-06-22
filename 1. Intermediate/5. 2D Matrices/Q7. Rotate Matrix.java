import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        You are given a n x n 2D matrix A representing an image.
        Rotate the image by 90 degrees (clockwise).
        You need to do this in place.
        Note:  Dont end up using an additional array.

        Input:
            1 2 3
            4 5 6
            7 8 9
        OutPut:
            7 4 1
            8 5 2
            9 6 3
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A[][] = new int[n][n];
        for(int row = 0; row<n; row++){
            for(int col=0; col<n; col++){
                A[row][col] = scn.nextInt();
            }
        }
        int ans[][] = solve(A);
        for(int row = 0; row<n; row++){
            for(int col=0; col<n; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solve(int[][] A) {
        for(int row = 0; row<A.length; row++){
            for (int col = row+1; col<A[0].length; col++){
                int temp=A[row][col];
                A[row][col]=A[col][row];
                A[col][row]=temp;
            }
        }
        for(int row = 0; row<A.length; row++){
            for (int col = A.length-1; col>=A.length/2; col--){
                int temp = A[row][col];
                A[row][col] = A[row][(A.length-1)-col];
                A[row][(A.length-1)-col] = temp;
            }
        }
        return A;
    }
}

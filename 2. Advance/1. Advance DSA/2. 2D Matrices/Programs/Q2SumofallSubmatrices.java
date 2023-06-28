import java.util.Scanner;

public class Q2SumofallSubmatrices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = scn.nextInt();
            }
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[][] A) {
        int sum = 0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                sum+=A[i][j] * (i+1) * (j+1) * (A.length-i) * (A[0].length-j);
            }
        }
        return sum;
    }
}

import java.util.Scanner;

public class Q3MaximumSubmatrix {
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
        long ans = solve(a);
        System.out.print(ans);
    }

    private static long solve(int[][] A) {
        long pfMatric[][] = new long[A.length][A[0].length];
        long ans = Long.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(j==0){
                    pfMatric[i][j] = A[i][j];
                }else{
                    pfMatric[i][j] = pfMatric[i][j-1] + A[i][j] ;
                }
            }
        }
        for(int col=0; col<A[0].length; col++){
            for(int row=0; row<A.length; row++){
                if(row==0){
                    pfMatric[row][col] = pfMatric[row][col];
                }else{
                    pfMatric[row][col] = pfMatric[row-1][col] + pfMatric[row][col] ;
                }
            }
        }
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                int a1 = i;
                int b1 = j;
                int a2 = A.length-1;
                int b2 = A[0].length-1;
                long sum = pfMatric[a2][b2];
                if(b1-1>=0){
                    sum-=pfMatric[a2][b1-1];
                }
                if(a1-1>=0){
                    sum-=pfMatric[a1-1][b2];
                }
                if(a1-1>=0 && b1-1>=0){
                    sum+=pfMatric[a1-1][b1-1];
                }
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
}

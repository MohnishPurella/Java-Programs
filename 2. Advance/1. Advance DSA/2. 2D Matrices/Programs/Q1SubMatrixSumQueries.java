import java.util.Scanner;

public class Q1SubMatrixSumQueries {
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
        int q = scn.nextInt();
        int b[] = new int[q];
        for(int i=0; i<q; i++){
            b[i] = scn.nextInt();
        }
        int c[] = new int[q];
        for(int i=0; i<q; i++){
            c[i] = scn.nextInt();
        }
        int d[] = new int[q];
        for(int i=0; i<q; i++){
            d[i] = scn.nextInt();
        }
        int e[] = new int[q];
        for(int i=0; i<q; i++){
            e[i] = scn.nextInt();
        }
        int ans[] = solve(a,b,c,d,e);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int pfMatric[][] = new int[A.length][A[0].length];
        int ans[] = new int[B.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                if(j==0){
                    pfMatric[i][j] = A[i][j];
                }else{
                    pfMatric[i][j] = pfMatric[i][j-1] + A[i][j] ;
                    pfMatric[i][j] = pfMatric[i][j] % (int) (Math.pow(10, 9) + 7);
                }
            }
        }
        for(int col=0; col<A[0].length; col++){
            for(int row=0; row<A.length; row++){
                if(row==0){
                    pfMatric[row][col] = pfMatric[row][col];
                }else{
                    pfMatric[row][col] = pfMatric[row-1][col] + pfMatric[row][col] ;
                    pfMatric[row][col] = pfMatric[row][col] % (int) (Math.pow(10, 9) + 7);
                }
            }
        }
        for(int i=0; i<B.length; i++){
            int a1 = B[i]-1;
            int b1 = C[i]-1;
            int a2 = D[i]-1;
            int b2 = E[i]-1;
            int sum = pfMatric[a2][b2];
            if(b1-1>=0){
                sum-=pfMatric[a2][b1-1];
                sum = sum % (int) (Math.pow(10, 9) + 7);
            }
            if(a1-1>=0){
                sum-=pfMatric[a1-1][b2];
                sum = sum % (int) (Math.pow(10, 9) + 7);
            }
            if(a1-1>=0 && b1-1>=0){
                sum+=pfMatric[a1-1][b1-1];
                sum = sum % (int) (Math.pow(10, 9) + 7);
            }
            if(sum<0){
                sum += (int) (Math.pow(10, 9) + 7);
            }
            ans[i] = sum;
        }
        return ans;
    }
}

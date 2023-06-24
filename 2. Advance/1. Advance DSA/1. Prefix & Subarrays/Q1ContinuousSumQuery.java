import java.util.Arrays;
import java.util.Scanner;

public class Q1ContinuousSumQuery {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int query = scn.nextInt();
        int b[][] = new int[query][3];
        for(int i= 0; i<query; i++){
            for(int j=0; j<3; j++){
                b[i][j] = scn.nextInt();
            }
        }

        int ans[] = solve(a,b);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] solve(int A, int[][] B) {
        int ans[] = new int[A];
        Arrays.fill(ans,0);
        for(int i=0; i<B.length; i++){
            int start = B[i][0];
            int end = B[i][1];
            int val = B[i][2];
            for(int j=start-1; j<=end-1; j++){
                ans[j]+=val;
            }
        }
        return ans;
    }
}

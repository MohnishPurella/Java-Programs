import java.util.Scanner;

public class Q6RangeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
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

    private static int[] solve(int A[], int[][] B) {
        int zeroArr[] = new int[A.length];
        int ans[] = new int[A.length];
        for(int i=0; i<B.length; i++){
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            int val = B[i][2];
            zeroArr[start] = zeroArr[start]+val;
            if((end+1)<A.length){
                zeroArr[end+1] = zeroArr[end+1]-val;
            }
        }
        for(int i=1; i<A.length; i++){
            zeroArr[i] = zeroArr[i-1]+zeroArr[i];
        }
        for(int j=0; j<A.length; j++){
            ans[j] = A[j] + zeroArr[j];
        }
        return ans;
    }
}

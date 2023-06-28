import java.util.Arrays;
import java.util.Scanner;

public class Q2Prefixmaximum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        int ans[] = solve(a);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] solve(int[] A) {
        int ans[] = new int[A.length];
        Arrays.fill(ans,0);
        ans[0]=A[0];
        for(int i=1;i<A.length;i++){
            ans[i] = Math.max(ans[i-1],A[i]);
        }
        return ans;
    }
}

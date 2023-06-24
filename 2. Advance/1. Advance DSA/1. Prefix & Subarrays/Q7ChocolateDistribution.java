import java.util.Arrays;
import java.util.Scanner;

public class Q7ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        int ans = solve(a,b);
        System.out.print(ans);
    }

    private static int solve(int[] A, int B) {
        if(A.length == 0 || B==0){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        ans = Math.min(A[B-1]-A[0], ans);
        for(int i=1; B-1+i<A.length; i++){
            ans = Math.min(A[B-1+i]-A[i], ans);
        }
        return ans;
    }
}

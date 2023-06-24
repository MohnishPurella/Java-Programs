import java.util.Arrays;
import java.util.Scanner;

public class Q5MaxSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<A.length; i++){
            sum = sum + A[i];
            ans = Math.max(sum,ans);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
}

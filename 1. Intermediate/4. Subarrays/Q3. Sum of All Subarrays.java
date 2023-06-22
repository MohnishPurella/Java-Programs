import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        You are given an integer array A of length N.

        You have to find the sum of all subarray sums of A.

        More formally, a subarray is defined as a contiguous part of an array
        which we can obtain by deleting zero or more elements from either end of the array.

        A subarray sum denotes the sum of all the elements of that subarray.

        A = [ 2 1 3 ]
        Output = 19
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = scn.nextInt();
        }
        System.out.print(solve(A));
    }

    private static long solve(int[] A) {
        long ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++)
            ans += (long)A[i] * (i + 1) * (n - i);
        return ans ;
    }
}

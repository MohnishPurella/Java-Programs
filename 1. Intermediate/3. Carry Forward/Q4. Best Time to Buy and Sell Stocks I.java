import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Say you have an array, A, for which the ith element is the price of a given stock on day i.
        If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
        design an algorithm to find the maximum profit.

        Return the maximum possible profit.

        A = [1, 4, 5, 2, 4]

        */
        Scanner scn = new Scanner(System.in);
        int no_of_Elements = scn.nextInt();
        int a[] = new int[no_of_Elements];
        for(int i=0; i<no_of_Elements; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        if(A.length == 0 || A.length == 1){
            return 0;
        }

        int max = A[A.length - 1];

        int profit = 0;
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] > max){
                max = A[i];
            }
            profit = Math.max(profit, max - A[i]);
        }

        return profit;
    }
}

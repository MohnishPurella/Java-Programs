import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of
        the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)),
        and you are supposed to choose 3 trees (let's say, indices p, q, and r),
        such that Ap < Aq < Ar, where p < q < r.

        The cost of these trees is Bp + Bq + Br.

        You are to choose 3 trees such that their total cost is minimum. Return that cost.

        If it is not possible to choose 3 such trees return -1.

        Input 1:
         A = [1, 3, 5]
         B = [1, 2, 3]

        Input 2:
         A = [1, 6, 4, 2, 6, 9]
         B = [2, 5, 7, 3, 2, 7]

         Output 1: 6
         Output 2: 7

         Explanation 1:
         We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6.

         Explanation 2:
         We can choose the trees with indices 1, 4 and 5, and the cost is 2 + 3 + 2 = 7.
         This is the minimum cost that we can get.
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        int b[] = new int[no_of_elements];
        for(int i=0; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        for(int i=0; i<no_of_elements; i++){
            b[i] = scn.nextInt();
        }
        int ans = solve(a,b);
        System.out.print(ans);
    }

    public static int solve(int[] A, int[] B) {
        final int inf = (int)(1e9 + 10);
        int n = A.length;
        int ans = inf;
        for(int i = 0 ; i < n ; i++){
            int left_min = inf , right_min = inf;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    left_min = Math.min(left_min, B[j]);
                }
            }
            for(int j = i + 1 ; j < n ; j++){
                if(A[j] > A[i]){
                    right_min = Math.min(right_min, B[j]);
                }
            }
            int temp_ans = left_min + B[i] + right_min;
            ans = Math.min(ans , temp_ans);
        }
        if(ans == inf) ans = -1;
        return ans;
    }
}

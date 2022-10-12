import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        You are given an integer array A of length N.
        You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
        For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
        More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int b[][] = new int[m][2];
        for(int i=0; i<m; i++){
            for(int j=0; j<2; j++){
                b[i][j] = scn.nextInt();
            }
        }
        int ans[] = solve(a,b);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
    public static int[] solve(int[] A, int[][]B){
        int[] arr = new int[B.length];
        //create prefix array of A
        int[] prefix_arr = new int[A.length];
        prefix_arr[0] = A[0];
        for(int i = 1; i<A.length; i++){
            prefix_arr[i] = prefix_arr[i-1]+A[i];
        }
        for(int i = 0 ;i<B.length ; i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l-1 == 0){
                arr[i] = prefix_arr[r-1];
            }else{
                arr[i] = prefix_arr[r-1] - prefix_arr[l-2];
            }
        }
        return arr;
    }
}

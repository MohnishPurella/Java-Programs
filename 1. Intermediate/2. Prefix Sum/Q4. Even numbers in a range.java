import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        You are given an array A of length N and Q queries given by the 2D array B of size Q*2.
        Each query consists of two integers B[i][0] and B[i][1].
        For every query, the task is to find the count of even numbers in the range A[B[i][0]…B[i][1]].

        A = [1, 2, 3, 4, 5]
        B = [   [0,2]
                [1,4]   ]

        [1, 2]
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int Q = scn.nextInt();
        int b[][] = new int[Q][2];
        for(int i=0; i<Q; i++){
            for(int j=0; j<2; j++){
                b[i][j] = scn.nextInt();
            }
        }
        int arr[] = solve(a,b);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] solve(int[] A, int[][]B){
        int[] ans = new int[B.length];
        int[] prefix_arr = new int[A.length];
        prefix_arr[0] = 1-(A[0]%2);
        for(int i=1;i<prefix_arr.length;i++){
            prefix_arr[i] = prefix_arr[i-1] + (1-(A[i]%2));
        }
        for(int i=0;i<B.length;i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l == 0){
                ans[i] = prefix_arr[r];
            }else{
                ans[i] = prefix_arr[r] - prefix_arr[l-1];
            }
        }
        return ans;
    }
}

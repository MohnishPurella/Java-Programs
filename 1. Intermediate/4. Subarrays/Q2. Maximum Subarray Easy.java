import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        You are given an integer array C of size A.
        Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
        But the sum must not exceed B.

        A = 5
        B = 12
        C = [2, 1, 3, 4, 5]

        Output: 12
         */
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C[] = new int[A];
        for(int i=0; i<A; i++){
            C[i] = scn.nextInt();
        }
        System.out.print(solve(A,B,C));
    }

    private static int solve(int A, int B, int[] C) {
        int temp = 0, ans = 0;
        int[] prefix_arr = new int[A];
        prefix_arr[0] = C[0];
        for(int i = 1; i<A; i++){
            prefix_arr[i] = prefix_arr[i-1] + C[i];
        }
        for(int i=0 ; i<A; i++){
            for(int j=i; j<A; j++){
                int sum = 0;
                if(i==0){
                    sum += prefix_arr[j];
                }else{
                    sum+= prefix_arr[j] - prefix_arr[i-1];
                }
                if(B>=sum){
                    temp = Math.max(temp,sum);
                }
                ans = temp;
            }
        }
        return ans;
    }
}

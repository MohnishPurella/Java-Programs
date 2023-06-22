import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        Given an array A of length N. Also given are integers B and C.

        Return 1 if there exists a subarray with length B having sum C and 0 otherwise

        Input:
            A = [4, 3, 2, 6]
            B = 2
            C = 5

         Output : 1

         Explanation :
            The subarray [3, 2] is of length 2 and sum 5.
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0 ; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        int c = scn.nextInt();
        int ans = solve(a, b, c);
        System.out.print(ans);
    }

    private static int solve(int[] A, int B, int C) {
        int sum = 0;
        for(int i=0 ; i<B; i++){
            sum+=A[i];
        }
        if(sum == C){
            return 1;
        }
        int s = 1, e = B;
        while(e<A.length){
            sum = sum - A[s-1] + A[e];
            if(sum == C){
                return 1;
            }
            s++;
            e++;
        }
        return 0;
    }
}

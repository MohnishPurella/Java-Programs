import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.

        NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Input 1:
            A = [1, 2, 2, 3, 1]

        Input 2:
            A = [1, 2, 2]

        Output 1: 3
        Output 2: 1
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        int ans = 0;
        for(int i=0; i<A.length; i++){
            ans ^= A[i];
        }
        return ans;
    }
}

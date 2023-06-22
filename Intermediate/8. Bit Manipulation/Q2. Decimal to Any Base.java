import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        Given a decimal number A and base B.
        You are required to change the decimal number A into the corresponding value in base B and return that.

        Input:
            A = 4
            B = 3
        Output: 11
         */
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = solve(a,b);
        System.out.print(ans);
    }

    private static int solve(int A, int B) {
        int ans = 0;
        int pow = 1;
        while(A > 0){
            int digit = A%B;
            A /= B;
            ans += digit*pow;
            pow *= 10;
        }
        return ans;
    }
}

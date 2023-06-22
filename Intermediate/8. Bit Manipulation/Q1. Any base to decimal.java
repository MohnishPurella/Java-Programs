import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        You are given a number A. You are also given a base B. A is a number on base B.
        You are required to convert the number A into its corresponding value in decimal number system.

        Input 1:
            A = 1010
            B = 2
        Input 2:
            A = 22
            B = 3

        Output 1: 10
        Output 2: 8
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int ans = solve(a,b);
        System.out.print(ans);
    }

    private static int solve(int A, int B) {
        int decimal = 0;
        int val = 0;
        for(int i=0; A>0; i++){
            int r = A%10;
            val = r * (int)Math.pow(B,i);
            A /=10;
            decimal+=val;
        }
        return decimal;
    }
}

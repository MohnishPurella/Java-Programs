import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        You are given two integers A and B.
        If B-th bit in A is set, make it unset
        If B-th bit in A is unset, leave it as it is
        Return the updated A value

         Input 1:
            A = 4
            B = 1
         Output 1: 4

         For Input 1:
            4 = 100
            1st position in 4 is 0 so its already unset so return 4.

         Input 2:
            A = 5
            B = 2
         Output 2: 1

         For Input 2:
            5 = 101
            2nd position in 5 is 1 whish is set so toggle it to unset(0)
            101 --> 001
            value of 001 is 1.
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(solve(a,b));
    }

    private static int solve(int A, int B) {
        if(((A>>B) & 1) == 1){
            return A ^ (1<<B);
        }
        return A;
    }
}

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        You are given two integers A and B.
        Set the A-th bit and B-th bit in 0, and return output in decimal.

         Input 1:
            A = 3
            B = 5
         Output 1: 40

         For Input 1:
            set 3rd position in 0 == 1000
            set 5th position in 0 == 100000

              1000 | 100000 = 101000(40)

         Input 2:
            A = 4
            B = 4
         Output 2: 16

         For Input 2:
            set 4th position in 0 == 10000
            set 4th position in 0 == 10000

              10000 | 10000 = 10000(16)
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(solve(a,b));
    }

    private static int solve(int A, int B) {
        return (0 | 1<<A) | (0 | 1<<B);
    }
}

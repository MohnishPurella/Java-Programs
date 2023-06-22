import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        You are given two integers A and B.
            Return 1 if B-th bit in A is set
            Return 0 if B-th bit in A is unset

         Input 1:
            A = 4
            B = 1
         Output 1: 0

         For Input 1:
            Given N = 4 which is 100 in binary. The 1-st bit is unset
            so we return 0

         Input 2:
            A = 5
            B = 2
         Output 2: 1

         For Input 2:
            Given N = 5 which is 101 in binary. The 2-nd bit is set
            so we return 1
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(solve(a,b));
    }

    private static int solve(int A, int B) {
        if((A|1<<B) == A){
            return 1;
        }
        return 0;
    }
}

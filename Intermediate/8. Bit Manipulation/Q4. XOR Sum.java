import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Given two integers A and B. Find the minimum value (A ⊕ X) + (B ⊕ X) that can be achieved for any X.

        where P ⊕ Q is the bitwise XOR operation of the two numbers P and Q.

        Input 1:-
            A = 6
            B = 12
        Input 2:-
            A = 4
            B = 9

        Output 1:- 10
        Output 2:- 13
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = solve(a,b);
        System.out.print(sum);
    }

    private static int solve(int A, int B) {
        int x = A&B;
        return ((A^x) + (B^x));
    }
}

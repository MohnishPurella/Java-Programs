import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Given an integer A. Unset B bits from the right of A in binary.
        For eg:-
        A = 93, B = 4
        A in binary = 1011101
        A should become = 1010000 = 80. Therefore return 80.
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.print(solve(a,b));
    }

    private static int solve(int A, int B) {
        for(int i=0 ; i<B; i++){
            if(((A>>i)&1)==1){
                A = A ^ 1<<i;
            }
        }
        return A;
    }
}

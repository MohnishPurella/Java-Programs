import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        Write a function that takes an integer and returns the number of 1 bits it has.

        Input: 11
        Outpur: 3
        Explaination: Binary representation of 11 is 1011 there are total 3 1's

         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.print(solve(a));
    }

    private static int solve(int A) {
        int count = 0;
        while(A>0){
            if(checkBit(A,0)){
                count++;
            }
            A = A>>1;
        }
        return count;
    }

    public static boolean checkBit(int A, int B){
        if((A&1) == 1){
            return true;
        }
        return false;
    }
}

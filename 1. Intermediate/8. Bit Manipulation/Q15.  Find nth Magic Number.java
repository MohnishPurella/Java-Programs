import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        /*
        Given an integer A, find and return the Ath magic number.

        A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

        First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

        Example Input 1:
            A = 3

        Example Input 2:
            A = 10

         Example Output 1:
            30
         Example Output 2:
            650

         Explanation 1:
            Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
            3rd element in this is 30
         Explanation 2:
            In the sequence shown in explanation 1, 10th element will be 650.
         */
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.print(solve(a));
    }

    private static int solve(int A) {
        int sum=0;
        int i=1;
        while(A>0)
        {
            if((A&1)==1){
                sum=sum+(int)Math.pow(5,i);
            }
            A=A>>1;
            i++;
        }
        return sum;
    }
}

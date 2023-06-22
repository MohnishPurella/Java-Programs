import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        You have an array A with N elements. We have two types of operation available on this array :

        1. We can split an element B into two elements, C and D, such that B = C + D.
        2. We can merge two elements, P and Q, to one element, R, such that R = P ^ Q i.e., XOR of P and Q.

        You have to determine whether it is possible to convert array A to size 1,
        containing a single element equal to 0 after several splits and/or merge?
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i = 0 ;i <no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        String ans = solve(a);
        System.out.print(ans);
    }

    private static String solve(int[] A) {
        int xor = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                xor^=0;
            }else{
                xor^=1;
            }
        }
        if(xor == 0){
            return "Yes";
        }
        return "N0";
    }
}

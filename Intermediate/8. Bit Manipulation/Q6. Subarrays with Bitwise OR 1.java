import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Given an array B of length A with elements 1 or 0.
        Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.

        Input 1:
            A = 3
            B = [1, 0, 1]
        Input 2:
            A = 2
            B = [1, 0]

        Example Output
        Output 1: 5
        Output2: 2
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i = 0 ;i <no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        System.out.print(solve(no_of_elements,a));
    }

    private static long solve(int A, int[] B) {
        int last=0;
        long ans=0;
        for(int i=0;i<A;i++){
            if(B[i]==1){
                last=i+1;
            }
            ans=ans+last;
        }
        return ans;
    }
}

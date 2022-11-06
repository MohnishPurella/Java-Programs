import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        You are given an integer array A.

        Decide whether it is possible to divide the array into one or more subarrays of even length such that the first
         and last element of all subarrays will be even.

        Return "YES" if it is possible; otherwise, return "NO" (without quotes).

        A = [2, 4, 8, 7, 6]

        Output: "No"
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        System.out.print(solve(a));
    }

    private static String solve(int[] A) {
        if(A.length == 0 || A.length == 1) return "NO";
        if(A.length%2!=0 || A[0]%2!=0 || A[A.length-1]%2!=0){
            return "NO";
        }
        return "YES";
    }
}

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

        Return the sum of maximum and minimum element of the array

        A = [-2, 1, -4, 5, 3]
        Output: 1
        Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
        */

        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.print(solve(a));
    }

    private static int solve(int[] A) {
        int max = A[0], min = A[0];
        for(int i=0;i<A.length; i++){
            if(max<A[i]){
                max = A[i];
            }
            if(min>A[i]){
                min = A[i];
            }
        }
        return max+min;
    }
}

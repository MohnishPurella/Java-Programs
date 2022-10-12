import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
            Given an integer array A of size N. In one second, you can increase the value of one element by 1.

            Find the minimum time in seconds to make all elements of the array equal.

            A = [2, 4, 1, 3, 2]
            Output : 8

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
        int sum = 0, max = A[0];
        for (int i=0; i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        for (int i=0; i<A.length; i++){
            if(A[i] != max){
                sum += (max-A[i]);
            }
        }
        return sum;
    }
}

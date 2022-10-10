import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        Given an array A and an integer B, find the number of occurrences of B in A.
        A = [1, 2, 2], B = 2
        Output : 2
        Element at index 2, 3 is equal to 2 hence count is 2.
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        System.out.print(solve(a, b));
    }
    public static int solve(int[] A, int B) {
        int count = 0;
        for(int i=0 ; i<A.length; i++){
            if(A[i]==B){
                count++;
            }
        }
        return count;
    }
}

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        You are given an array A of integers of size N.
        Your task is to find the equilibrium index of the given array
        The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the
        sum of elements at higher indexes.

        NOTE:
        Array indexing starts from 0.
        If there is no equilibrium index then return -1.
        If there are more than one equilibrium indexes then return the minimum index.
         */

        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.print(solve(a));
    }
    public static int solve(int[] A){
        int a = -1;
        int[] prefix_arr = new int[A.length];
        prefix_arr[0] = A[0];
        for (int i=1 ; i<prefix_arr.length; i++){
            prefix_arr[i] = prefix_arr[i-1]+A[i];
        }
        for (int i=0 ; i<prefix_arr.length; i++){
            int leftSum, rightSum;
            if(i==0){
                leftSum = 0;
            }else{
                leftSum = prefix_arr[i-1];
            }
            rightSum = prefix_arr[prefix_arr.length-1]-prefix_arr[i];
            if(leftSum == rightSum){
                return i;
            }
        }
        return a;
    }
}

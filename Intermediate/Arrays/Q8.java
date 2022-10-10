import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        You are given an integer array A.
        You have to find the second largest element/value in the array or report that no such element exists.

        A = [13 7 16 18 14 17 18 8]
        Output: 17
         First largest element = 18
         Second largest element = 17
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        System.out.print(solve(a));
    }
    public static int solve(int[] A) {
        int maxValue = -1;
        int secondMaxValue = -1;
        for(int i = 0; i < A.length; i++){
            if(maxValue < A[i]){
                secondMaxValue= maxValue;
                maxValue = A[i];
            }else if(A[i] != maxValue && A[i]>secondMaxValue){
                secondMaxValue = A[i];
            }
        }
        return secondMaxValue;
    }
}

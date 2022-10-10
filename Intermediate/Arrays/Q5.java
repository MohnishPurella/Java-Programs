import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        /*
        Given an integer array A of size N and an integer B,
        you have to return the same array after rotating it B times towards the right.

        A = 1 2 3 4 5
        B = 1
        C = 4
        Output:
        1 5 4 3 2

        */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int arr[] = new int[no_of_elements];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int B = scn.nextInt();
        int reversArrSol[] = solve(arr, B);
        for(int i=0; i<reversArrSol.length; i++){
            System.out.print(reversArrSol[i] + " ");
        }
    }

    public static int[] solve(int[] A, int B){
        B = B%A.length;
        if(B==0) return A;

        int reverseArr[] = reverCompleteArrayApproach(A);
        reverseArr = reverRangeApproach2(reverseArr, 0,B-1);
        reverseArr = reverRangeApproach2(reverseArr, B,A.length-1);
        return reverseArr;
    }

    private static int[] reverCompleteArrayApproach(int[] A) {
        int ans [] = new int[A.length];
        for(int i= 0 ; i< A.length; i++){
            ans[i] = A[A.length-i-1];
        }
        return ans;
    }

    private static int[] reverRangeApproach2(int[] A, int B, int C) {
        int i = B, j = C;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }
}

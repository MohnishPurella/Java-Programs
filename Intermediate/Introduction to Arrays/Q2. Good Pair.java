import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
        Check if any good pair exist or not.

        Return 1 if good pair exist otherwise return 0.

        Input:
        A = [1,2,3,4]
        B = 7
        Output: 1
        */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int arr[] = new int[no_of_elements];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        System.out.println(approch1(arr,b));
    }

    private static int approch1(int[] A, int B) {
        int count = 0;
        for(int i= 0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i]+A[j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}

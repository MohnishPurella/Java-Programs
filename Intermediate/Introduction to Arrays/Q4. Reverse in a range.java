import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        /*
        Given an array A of N integers. Also given are two integers B and C.
        Reverse the array A in the given range [B, C]

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
        int start = scn.nextInt();
        int end = scn.nextInt();
        int rangeArrRev [] = reverRangeApproach1(arr, start, end);
        for(int i=0; i<rangeArrRev.length; i++){
            System.out.print(rangeArrRev[i]+" ");
        }
        System.out.println();
        int rangeArrRev2 [] = reverRangeApproach2(arr, start, end);
        for(int i=0; i<rangeArrRev2.length; i++){
            System.out.print(rangeArrRev2[i]+" ");
        }
    }

    private static int[] reverRangeApproach1(int[] A, int B, int C) {
        int i = B, j = C;
        while(i<j){
            A = swapElements(A,i,j);
            i++;
            j--;
        }
        return A;
    }

    private static int[] swapElements(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
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

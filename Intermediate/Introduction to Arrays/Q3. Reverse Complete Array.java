import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        /*
        Reverse Complete Array
        arr = [1 2 3 4 5]
        Output:
        [5 4 3 2 1]
        */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int arr[] = new int[no_of_elements];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int completeArrRev[] = reverCompleteArrayApproach1(arr);
        for(int i=0; i<completeArrRev.length; i++) {
            System.out.print(completeArrRev[i] + " ");
        }
        System.out.println();
        int completeArrRev1[] = reverCompleteArrayApproach2(arr);
        for(int i=0; i<completeArrRev1.length; i++) {
            System.out.print(completeArrRev1[i] + " ");
        }
        System.out.println();
        int completeArrRev2[] = reverCompleteArrayApproach3(arr);
        for(int i=0; i<completeArrRev2.length; i++) {
            System.out.print(completeArrRev2[i] + " ");
        }

    }

    private static int[] reverCompleteArrayApproach1(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i<j){
            arr = swapElements(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }

    private static int[] swapElements(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    private static int[] reverCompleteArrayApproach2(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    private static int[] reverCompleteArrayApproach3(int[] A) {
        int ans [] = new int[A.length];
        for(int i= 0 ; i< A.length; i++){
            ans[i] = A[A.length-i-1];
        }
        return ans;
    }
}

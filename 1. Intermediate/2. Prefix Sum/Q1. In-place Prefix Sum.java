import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        Given an array A of N integers. Construct prefix sum of the array in the given array itself.
        A = [1, 2, 3, 4, 5]
        Output = [1, 3, 6, 10, 15]
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int ans[] = approach1(a);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        int ans1[] = approach2(a);
        for(int i=0; i<ans1.length; i++){
            System.out.print(ans1[i] + " ");
        }
    }
    public static int[] approach1(int[] A){
        int[] prefix_arr = new int[A.length];
        prefix_arr[0] = A[0];
        for(int i = 1; i<A.length; i++){
            prefix_arr[i] = prefix_arr[i-1]+A[i];
        }
        return prefix_arr;
    }

    public static int[] approach2(int[] A){
        for(int i = 1; i<A.length; i++){
            A[i] += A[i-1];
        }
        return A;
    }
}

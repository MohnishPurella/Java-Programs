import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        Given an array of size N, find the majority element.
        The majority element is the element that appears more than floor(n/2) times.
        You may assume that the array is non-empty and the majority element always exists in the array.

        Example Input: [2, 1, 2]

        Example Output: 2
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        int element = A[0], frecuency = 1, count=0;
        for(int i=1; i<A.length; i++){
            if(frecuency == 0){
                element = A[i];
                frecuency = 1;
            }else if(A[i]==element){
                frecuency++;
            }else {
                frecuency--;
            }
        }
        return element;
    }
}

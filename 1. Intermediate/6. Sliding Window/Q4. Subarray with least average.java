import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Given an array of size N, find the subarray of size K with the least average.

        Output Format
            Return the index of the first element of the subarray of size k that has least average.
            Array indexing starts from 0.
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0 ; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        int ans = solve(a, b);
        System.out.print(ans);
    }

    private static int solve(int[] A, int B) {
        int sum = 0,startIndex = 0;
        float avg = 0;
        for(int i=0 ; i<B; i++){
            sum+=A[i];
        }
        avg = (float)sum/B;
        System.out.println("avg = " +avg);
        int s = 1, e = B;
        float ans = avg;
        while(e<A.length){
            System.out.println("StartIndex = " +startIndex);
            sum = sum - A[s-1] + A[e];
            avg = (float)sum/B;
            System.out.println("avg = " +avg);
            if(ans > avg){
                ans = avg;
                startIndex = s;
            }
            s++;
            e++;
        }
        return startIndex;
    }
}

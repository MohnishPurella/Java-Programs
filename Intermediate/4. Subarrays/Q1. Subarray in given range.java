import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        Given an array A of length N, return the subarray from B to C.
        A = [ 1 2 3 4 5 ]
        B = 1
        C = 4
        Output: [2 3 4 5]
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<no_of_elements;i++){
            a.add(scn.nextInt());
        }
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.print(solve(a,b,c));
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> ans =  new ArrayList<>();
        for(int i=B; i<=C; i++){
            ans.add(A.get(i));
        }
        return ans;
    }
}

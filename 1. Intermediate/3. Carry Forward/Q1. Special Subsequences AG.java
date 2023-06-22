import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        You have given a string A having Uppercase English letters.
        You have to find how many times subsequence "AG" is there in the given string.
        NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
        A = "ABCGAG"
        Output: 3
         */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int ans = solve(str);
        System.out.print(ans);
    }

    private static int solve(String A) {
        int gCount = 0, count = 0;
        for(int i=A.length()-1; i>=0; i--){
            if(A.charAt(i)=='G'){
                gCount++;
            }else if(A.charAt(i)=='A'){
                count+=gCount;
            }
        }
        return count;
    }
}

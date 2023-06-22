import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        /*
        You are given a string S, and you have to find all the amazing substrings of S.

        An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

        Output :
        Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.

        Input
            ABEC

        Output
            6

        Explanation
            Amazing substrings of given string are :
            1. A
            2. AB
            3. ABE
            4. ABEC
            5. E
            6. EC
            here number of substrings are 6 and 6 % 10003 = 6.
         */
        Scanner scn = new Scanner(System.in);
        String S = scn.next();
        System.out.print(solve(S));
    }

    private static int solve(String A) {
        long no_of_Amazing_Substring = 0;
        for(int i=0 ; i<A.length(); i++){
            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o'|| A.charAt(i)=='u'|| A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O'|| A.charAt(i)=='U'){
                no_of_Amazing_Substring+=A.length() - i;
            }
        }
        return (int)(no_of_Amazing_Substring % 10003);
    }
}

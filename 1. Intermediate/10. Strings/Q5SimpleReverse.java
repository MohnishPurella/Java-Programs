import java.util.Scanner;

public class Q5SimpleReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = solve(str);
        System.out.print(ans);
    }

    private static String solve(String A) {
        char str[] = A.toCharArray();
        char str1[] = new char[A.length()];
        for(int i=0;i<A.length();i++){
            str1[i] = str[A.length()-1-i];
        }
        return new String(str1);
    }
}

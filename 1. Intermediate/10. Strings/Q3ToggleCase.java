import java.util.ArrayList;
import java.util.Scanner;

public class Q3ToggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        String str = scn.nextLine();
        String ans = solve(str);
        System.out.print(ans);
    }

    private static String solve(String A) {
        char str[] = new char[A.length()];
        for(int i=0; i<A.length(); i++){
            str[i] = A.charAt(i);
        }
        for(int i=0; i<str.length; i++){
            if(str[i]>='A' && str[i]<='Z'){
                char character = (char) (str[i]+ 32);
                str[i] = character;
            }else if(str[i]>='a' && str[i]<='z'){
                char character = (char) (str[i]- 32);
                str[i] = character;
            }
        }
        String ans = new String(str);
        return ans;
    }
}

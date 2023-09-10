import java.util.ArrayList;
import java.util.Scanner;

public class Q2toUpper {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        ArrayList<Character> a = new ArrayList<>();
        String str = scn.nextLine();
        for(int i=0; i<str.length(); i++){
            a.add(str.charAt(i));
        }
        ArrayList<Character> ans = toUpper(a);
        System.out.print(ans);
    }

    private static ArrayList<Character> toUpper(ArrayList<Character> A) {
        for(int i=0; i<A.size(); i++){
            if(A.get(i)>='a' && A.get(i)<='z'){
                char character = (char) (A.get(i)- 32);
                A.set(i, character);
            }
        }
        return A;
    }
}

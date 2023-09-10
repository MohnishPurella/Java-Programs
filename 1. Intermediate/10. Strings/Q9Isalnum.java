import java.util.ArrayList;
import java.util.Scanner;

public class Q9Isalnum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        ArrayList<Character> a = new ArrayList<>();
        String str = scn.nextLine();
        for(int i=0; i<str.length(); i++){
            a.add(str.charAt(i));
        }
        int ans = toUpper(a);
        System.out.print(ans);
    }

    private static int toUpper(ArrayList<Character> a) {
        int ans = 1;
        for(int i=0; i<a.size(); i++){
            if(!(a.get(i)>='A'&&a.get(i)<='Z' || a.get(i)>='a'&&a.get(i)<='z' || a.get(i)>='0'&&a.get(i)<='9')){
                return 0;
            }
        }
        return ans;
    }
}

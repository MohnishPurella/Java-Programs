import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5SortByColor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(scn.nextInt());
        }
        ArrayList<Integer> ans = solve(al);
        System.out.print(ans);
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A);
        return A;
    }
}

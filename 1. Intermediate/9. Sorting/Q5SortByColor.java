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
        int zero_count = 0;
        int one_count = 0;
        int two_count = 0;
        for (Integer integer : A) {
            if (integer == 0) {
                zero_count++;
            } else if (integer == 1) {
                one_count++;
            } else {
                two_count++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<zero_count; i++){
            ans.add(0);
        }
        for(int i=0; i<one_count; i++){
            ans.add(1);
        }
        for(int i=0; i<two_count; i++){
            ans.add(2);
        }
        return ans; 
    }
}

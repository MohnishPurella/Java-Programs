import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<no_of_elements;i++){
            a.add(scn.nextInt());
        }
        System.out.print(solve(a));
    }

    private static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arr =  new ArrayList<>();
        for(int s=0 ; s<A.size(); s++){
            for(int e=s ; e<A.size(); e++){
                ArrayList<Integer> ans =  new ArrayList<>();
                for (int i=s ; i<=e; i++){
                    ans.add(A.get(i));
                }
                arr.add(ans);
            }
        }
        return arr;
    }
}

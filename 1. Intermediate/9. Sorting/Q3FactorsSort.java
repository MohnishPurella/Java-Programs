import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q3FactorsSort {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(scn.nextInt());
        }
        ArrayList<Integer> ans = solve(a);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> a) {
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num1Factor = factorCount(o1);
                int num2Factor = factorCount(o2);
                if(num1Factor>num2Factor){
                    return 1;
                }else if(num1Factor == num2Factor){
                    if(o1>o2){
                        return 1;
                    }else if(o1<o2){
                        return -1;
                    }else{
                        return 0;
                    }
                }
                return -1;
            }
        });
        return a;
    }

    private static int factorCount(int n) {
        int count = 0;
        for(int i=1; i<=n/2;i++){
            if(n%i == 0){
                count++;
            }
        }
        return count++;
    }
}

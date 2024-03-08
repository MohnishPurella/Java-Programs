import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q6ArithmeticProgression { 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(scn.nextInt());
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }
                return 0;
            }
        });
        int difference = A.get(0)-A.get(1);
        for(int i=1; i<A.size()-1; i++){
            if(difference!=A.get(i)-A.get(i+1)){
                return 0;
            }
        }
        return 1;
    }
}

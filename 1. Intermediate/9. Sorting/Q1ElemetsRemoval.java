import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q1ElemetsRemoval {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(scn.nextInt());
        }
        int ans = solve(al);
        System.out.print(ans);
    }

    private static int solve(ArrayList<Integer> al) {
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return 1;
                }else if(o1>o2){ 
                    return -1;
                }
                return 0;
            }
        });
        int ans = 0;
        for(int i=0; i<al.size(); i++){
            ans = (al.get(i)*(i+1))+ans;
        }
        return ans;
    }
}

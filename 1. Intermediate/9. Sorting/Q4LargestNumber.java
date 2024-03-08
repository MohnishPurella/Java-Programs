import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q4LargestNumber {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++){
            a.add(scn.nextInt());
        }
        String ans = solve(a);
        System.out.println(ans);
    }

    private static String solve(ArrayList<Integer> al) {
        int count = 0;
        for(int item:al){
            if(item!=0){
                count++;
            }
        }
        if(count == 0){
            return "0";
        }
        Collections.sort(al, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = Integer.toString(o1);
                String b = Integer.toString(o2);
                return (b+a).compareTo((a+b));
            }
        });
        String ans = "";
        for(int item:al){ 
            ans+=item;
        }
        return ans;
    }
}

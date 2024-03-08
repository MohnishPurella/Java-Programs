import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q7TensDigitSorting {
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
        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num1TensValue = getsTensPlace(o1);
                int num2TensValue = getsTensPlace(o2); 
                if(num1TensValue<num2TensValue){
                    return -1;
                }else if(num1TensValue==num2TensValue){
                    if(o1>o2){
                        return -1;
                    }else if(o1<o2){
                        return 1;
                    }else{
                        return 0;
                    }
                }
                return 1;
            }
        });
        return A;
    }

    private static int getsTensPlace(int n) {
        if((n%100)/10 == 0){
            return 0;
        }
        return (n%100)/10;
    }
}

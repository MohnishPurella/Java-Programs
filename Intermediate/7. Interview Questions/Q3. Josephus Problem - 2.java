import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        There are A people standing in a circle. Person 1 kills their immediate clockwise neighbour and pass the knife
        to the next person standing in circle. This process continues till there is only 1 person remaining.
        Find the last person standing in the circle.
         */
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans = solve(num);
        System.out.print(ans);
    }

    private static int solve(int A) {
        ArrayList<Integer> arrlst = new ArrayList<>();
        for(int i=1; i<=A; i++){
            arrlst.add(i);
        }
        int i=0;
        while(arrlst.size()!=1){
            arrlst.remove(i+1);
            arrlst.add(arrlst.get(i));
            arrlst.remove(i);
        }
        return arrlst.get(i);
    }
}

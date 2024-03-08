import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2NobleInteger {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<al.size();i++){
            al.get(scn.nextInt());
        }
        int ans = solve(al);
    }

    private static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        if(A.get(n-1)==0){
            return 1;
        }
        int moreCount = 0;
        for(int i=n-2; i>=0; i--){
            if(A.get(i)!=A.get(i+1)){
                moreCount = n-1-i;
            }
            if(moreCount == A.get(i)){
                return 1; 
            }
        }
        return -1;
    }


}

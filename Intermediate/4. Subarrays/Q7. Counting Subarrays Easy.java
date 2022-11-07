import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        Given an array A of N non-negative numbers and a non-negative number B,
        you need to find the number of subarrays in A with a sum less than B.
        We may assume that there is no overflow.

        A = [2, 5, 6]
        B = 10
        Output : 4
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<no_of_elements;i++){
            a.add(scn.nextInt());
        }
        int b = scn.nextInt();
        System.out.print(solve(a,b));
    }
    private static int solve(ArrayList<Integer> A, int B) {
        int ans=0;
        for(int i=0;i<A.size();i++){
            int sum=0;
            for(int j=i;j<A.size();j++){
                sum+=A.get(j);
                if(sum<B)
                    ans++;
            }
        }
        return ans;
    }
}

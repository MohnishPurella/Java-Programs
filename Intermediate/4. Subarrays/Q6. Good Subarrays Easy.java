import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
        1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
        2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
        Your task is to find the count of good subarrays in A.

        A = [1, 2, 3, 4, 5]
        B = 4
        Output : 6
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
            int countOfLength=0;
            for(int j=i;j<A.size();j++){
                countOfLength++;
                sum+=A.get(j);
                if((sum>B && countOfLength%2!=0 )||( sum<B && countOfLength%2==0))
                    ans++;
            }
        }return ans;
    }
}

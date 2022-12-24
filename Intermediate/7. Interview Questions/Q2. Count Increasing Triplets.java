import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]

        A = [1, 2, 4, 3]
        Ans = 2

         */
        Scanner scn = new Scanner(System.in);
        int no_of_element = scn.nextInt();
        int a[] = new int[no_of_element];
        for(int i=0; i<no_of_element; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        int ans = 0;
        for(int i=0; i<A.length; i++){
            int fixed_num = A[i];
            int l=0,r=0;
            for(int j=i-1; j>=0; j--){
                if(A[j]<fixed_num){
                    l++;
                }
            }
            for(int k=i+1; k<A.length; k++){
                if(A[k]>fixed_num){
                    r++;
                }
            }
            int count = l*r;
            ans += count;
        }
        return ans;
    }
}

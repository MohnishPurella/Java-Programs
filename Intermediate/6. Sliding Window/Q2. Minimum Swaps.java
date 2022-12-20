import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
            Given an array of integers A and an integer B,
            find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.

            Note: It is possible to swap any two elements, not necessarily consecutive.
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0 ; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        int ans = solve(a, b);
        System.out.print(ans);
    }

    private static int solve(int[] A, int B) {
        int no_less_B = 0;
        for(int x: A){
            if(x<=B){
                no_less_B++;
            }
        }

        if(no_less_B<=1){
            return 0;
        }else{
            int l=0, r=0, x=0;
            while(r<no_less_B){
                if(A[r]>B)
                    x++;
                r++;
            }
            int ans = x;
            while(r<A.length){
                if(A[r]>B)
                    x++;

                if(A[l]>B)
                    x--;

                ans = Math.min(ans,x);
                r++;
                l++;
            }
            return ans;
        }
    }
}
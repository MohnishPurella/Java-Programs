import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        You are given an integer array A of size N.

        You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0)
        from the right end of array A to get the maximum sum.

        Find and return this maximum possible sum.

        NOTE: Suppose B = 4, and array A contains 10 elements, then

        You can pick the first four elements or can pick the last four elements,
        or can pick 1 from front and 3 from the back, etc.
        You need to return the maximum possible sum of elements you can pick.

        A = [ 6 8 2 1 4 ]
        B = 3
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0;i<no_of_elements;i++){
            a[i] = scn.nextInt();
        }
        int b = scn.nextInt();
        System.out.print("Ans: "+approach1(a,b));
        approach2(a,b);
    }
    private static int approach1(int[] A, int B) {

        int[] pf = new int[A.length+1];
        pf[0] = 0;
        for(int i = 1; i < pf.length; i++){
            pf[i] = pf[i-1] + A[i-1];
        }
        int ans = pf[B];
        int back =0;
        int temp = B;
        for(int j = A.length-1; j >= A.length-temp; j--){
            back = back + A[j];
            int curr = pf[B-1] + back;
            ans = Math.max( ans , curr);
            B--;
        }

        return ans;
    }
    private static int approach2(int[] A, int B) {
        double ans = -1e9;
        int sum = 0;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        ans = Math.max(ans,sum);
        int back = B-1;
        for(int i=A.length-1;i>=A.length-B;i--){
            sum-=A[back];
            sum+=A[i];
            ans = Math.max(ans,sum);
            back--;
        }
        return (int)ans;
    }

}

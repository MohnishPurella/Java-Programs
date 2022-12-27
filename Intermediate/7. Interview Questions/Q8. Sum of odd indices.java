import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        /*
        You are given an array A of length N and Q queries given by the 2D array B of size Q*2.
        Each query consists of two integers B[i][0] and B[i][1].
        For every query, the task is to calculate the sum of all odd indices in the range A[B[i][0]…B[i][1]].

        Input 1:
            A = [1, 2, 3, 4, 5]
            B = [   [0,2]
                    [1,4]   ]
        Input 2:
            A = [2, 1, 8, 3, 9]
            B = [   [0,3]
                    [2,4]   ]

        Output 1:
            [2, 6]
        Output 2:
            [4, 3]

         */
        Scanner scn =new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int q = scn.nextInt();
        int b[][] = new int[q][2];
        for(int i=0; i<q; i++){
            for(int j=0; j<2; j++){
                b[i][j] = scn.nextInt();
            }
        }
        int ans[] = solve(a,b);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] +" ");
        }
    }

    private static int[] solve(int[] A, int[][] B) {
        int ans[] = new int[B.length];
        int oPS [] = new int[A.length];
        oPS[0] = 0;
        for(int i=1; i<oPS.length; i++){
            if(i%2!=0){
                oPS[i]=oPS[i-1]+A[i];
            }else{
                oPS[i] = oPS[i-1];
            }
        }
        for(int i=0; i<B.length; i++){
            int s=B[i][0], e=B[i][1];
            if(s==0){
                ans[i] = oPS[e];
            }else{
                ans[i] = oPS[e] - oPS[s-1];
            }
        }
        return ans;
    }
}

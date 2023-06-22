import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and
        return the generated square matrix.

        Input :5
         */
        Scanner scn = new Scanner(System.in);
        int matrixSize = scn.nextInt();
        int a[][] = solve(matrixSize);
        for(int i=0 ; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] solve(int A) {
        int ans[][] = new int[A][A];
        int i=0,j=0,n=A, sum=1;
        if(n==1){
        ans[i][j]=sum;
        }
        while(n>1){
            for(int k=1; k<n; k++){
                ans[i][j] = sum++;
                j++;
            }
            for(int k=1; k<n; k++){
                ans[i][j] = sum++;
                i++;
            }
            for(int k=1; k<n; k++){
                ans[i][j] = sum++;
                j--;
            }
            for(int k=1; k<n; k++){
                ans[i][j] = sum++;
                i--;
            }
            n=n-2;
            i++;
            j++;
        }
        if(n==1){
            ans[i][j]=sum++;
        }
        return ans;
    }
}

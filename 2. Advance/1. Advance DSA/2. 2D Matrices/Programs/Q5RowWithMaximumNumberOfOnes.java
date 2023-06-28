import java.util.Scanner;

public class Q5RowWithMaximumNumberOfOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = scn.nextInt();
            }
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[][] A) {
        int ans = 0;
        int i = 0;
        int j = A[0].length-1;
        while(i<A.length && j>=0){
            if(A[i][j] == 1){
                ans = i;
                j--;
            }else{
                i++;
            }
        }
        return ans;
    }
}

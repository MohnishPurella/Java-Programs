import java.util.Scanner;

public class Q4SearchInaRowWiseAndColumnWiseSortedMatrix {
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
        int b = scn.nextInt();
        int ans = solve(a,b);
        System.out.print(ans);
    }

    private static int solve(int[][] A, int B) {
        int ans = Integer.MAX_VALUE;
        int i = 0;
        int j = A[0].length-1;
        while(i<A.length && j>=0){
            if(A[i][j] == B){
                ans = Math.min(ans, (((i+1)*1009) +(j+1)));
                j--;
            }else if(A[i][j]>B){
                j--;
            }else{
                i++;
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
}

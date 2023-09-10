import java.util.Scanner;

public class Q12CountOccurrences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int ans = solve(str);
        System.out.print(ans);
    }

    private static int solve(String A) {
        int ans = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='b'){
                if((i+1<A.length() && i+2<A.length()) && (A.charAt(i+1)=='o' && A.charAt(i+2)=='b')){
                    ans++;
                }
            }
        }
        return ans;
    }
}

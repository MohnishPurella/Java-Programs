import java.util.Scanner;

public class Q7LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A = scn.next();
        String ans = solve(A);
        System.out.print(ans);
    }

    private static String solve(String A) {
        int n = A.length();
        int max_length = 1, s_index = 0, e_index = 0;
        for(int i=0; i<n; i++){
            int l = i-1;
            int r = i+1;
            int length = 0;
            while(l>=0 && r<n){
                if(A.charAt(l) == A.charAt(r)){
                    length = r-l+1;
                    l--;
                    r++;
                }else{
                    break;
                }
            }
            if(max_length<length){
                max_length = length;
                s_index = l+1;
                e_index = r-1;
            }
        }
        for(int i=0; i<n; i++){
            int l = i;
            int r = i+1;
            int length = 0;
            while(l>=0 && r<n){
                if(A.charAt(l) == A.charAt(r)){
                    length = r-l+1;
                    l--;
                    r++;
                }else{
                    break;
                }
            }
            if(max_length<length){
                max_length = length;
                s_index = l+1;
                e_index = r-1;
            }
        }
        String ans="";
        for(int i=s_index; i<=e_index; i++){
            ans+=A.charAt(i);
        }
        return ans;
    }
}

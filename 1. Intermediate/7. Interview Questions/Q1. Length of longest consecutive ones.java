import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
        Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
        Find and return the length of the longest consecutive 1’s that can be achieved.

        Input 1:
            A = "111000"
        Output 1:
            3

        Input 2:
            A = "111011101"
        Output 2:
            7
         */
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int ans = soleve(str);
        System.out.print(ans);
    }

    private static int soleve(String A) {
        int count = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i) == '1'){
                count++;
            }
        }
        if(count == A.length()){
            return A.length();
        }else if(count == 0){
            return 0;
        }
        int ans = 0;
        for(int i=0; i<A.length(); i++){
            if(A.charAt(i)=='0'){
                int l=0, r=0;
                for(int j=i-1; j>=0; j--){
                    if(A.charAt(j)=='1'){
                        l++;
                    }else{
                        break;
                    }
                }
                for(int k=i+1; k<A.length(); k++){
                    if(A.charAt(k)=='1'){
                        r++;
                    }else {
                        break;
                    }
                }
                if(count > l+r){
                    ans = Math.max(ans, l+r+1);
                }else{
                    ans = Math.max(ans, l+r);
                }
            }
        }
        return ans;
    }
}

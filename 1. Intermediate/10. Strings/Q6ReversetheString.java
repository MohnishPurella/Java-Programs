import java.util.Scanner;

public class Q6ReversetheString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = solve(str);
        System.out.print(ans);
    }

    private static String solve(String A) {
        int n = A.length()-1, i =0;
        String ans = "";
        while(i<n){
            String temp = "";
            while(A.charAt(i)==' ' && i<n){
                i++;
            }
            while(A.charAt(i)!=' ' && i<n){
                temp+=A.charAt(i);
                i++;
            }
            if(ans.length() == 0){
                ans = temp;
            }else{
                ans = temp+" "+ans;
            }
        }
        return ans;
    }
}
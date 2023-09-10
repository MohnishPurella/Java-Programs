import java.util.Scanner;

public class Q10StringOperations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String ans = solve(a);
        System.out.print(ans);
    }

    private static String solve(String A) {
        String str = "";
        for(int i=0; i<A.length(); i++){
            if(!(A.charAt(i)>='A' && A.charAt(i)<='Z')){
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u'){
                    str+='#';
                }else{
                    str+=A.charAt(i);
                }
            }
        }
        str+=str;
        return str;
    }
}

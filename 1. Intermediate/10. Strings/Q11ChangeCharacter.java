import java.util.Arrays;
import java.util.Scanner;

public class Q11ChangeCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        int b = scn.nextInt();
        int ans = solve(a,b);
        System.out.print(ans);
    }

    private static int solve(String A, int B) {
        if(B>= A.length()) return 1;
        int ch[] = new int[26];
        for(int i=0;i<A.length();i++){
            int index = A.charAt(i)-'a';
            ch[index] +=1;
        }
        int total = 0;
        for(int i=0;i<26;i++){
            if(ch[i]!=0){
                total++;
            }
        }
        Arrays.sort(ch);
        int count = 0;
        for(int i=0;i<26;i++){
            if(ch[i]!=0 && B-ch[i]>=0){
                B=B-ch[i];
                count++;
            }
        }
        return total-count;
    }
}

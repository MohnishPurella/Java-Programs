import java.util.Scanner;

public class Q13CheckAnagrams {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String str1 = scn.next();
        int ans = solve(str, str1);
        System.out.print(ans);
    }

    private static int solve(String A, String B) {
        int ch1[] = new int[26];
        int ch2[] = new int[26];
        for(int i=0; i<A.length(); i++){
            int index1 = A.charAt(i) - 'a';
            int index2 = B.charAt(i) - 'a';
            ch1[index1]+=1;
            ch2[index2]+=1;
        }
        for(int i=0; i<26; i++){
            if(ch1[i]!=ch2[i]){
                return 0;
            }
        }
        return 1;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Q8LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(scn.next());
        }
        String ans = solve(al);
        System.out.print(ans);
    }

    private static String solve(ArrayList<String> al) {
        String ans = "";
        int n = al.get(0).length();
        for(int i=1;i<al.size();i++){
            n = Math.min(n,al.get(i).length());
        }
        for(int i=0; i<n; i++){
            int flag = 0;
            for(int j=1; j<al.size(); j++){
                if(al.get(0).charAt(i) != al.get(j).charAt(i)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                ans+=al.get(0).charAt(i);
            }else{
                return ans;
            }
        }
        return ans;
    }
}

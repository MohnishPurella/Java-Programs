import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
        An element is a leader if it is strictly greater than all the elements to its right side.
        NOTE:The rightmost element is always a leader.

         A = [16, 17, 4, 3, 5, 2]
         Output = [2, 5, 17]
        */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<no_of_elements;i++){
            al.add(scn.nextInt());
        }
        ArrayList<Integer> ans= solve(al);
        System.out.print(ans);
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> leaderArr = new ArrayList<>();
        int max = A.get(A.size()-1);
        leaderArr.add(max);
        for(int i = A.size()-2; i>=0; i--){
            if(A.get(i)>max){
                max = A.get(i);
                leaderArr.add(max);
            }
        }
        return leaderArr;
    }
}

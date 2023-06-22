import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        /*
        Given an array of integers A and multiple values in B,
        which represents the number of times array A needs to be left rotated.

        Find the rotated array for each value and return the result in the from of a matrix where ith row
        represents the rotated array for the ith value in B.

        Input 1:
            A = [1, 2, 3, 4, 5]
            B = [2, 3]

        Input 2:
            A = [5, 17, 100, 11]
            B = [1]

        Output 1:
            [ [3, 4, 5, 1, 2]
             [4, 5, 1, 2, 3] ]

        Output 2:                    
            [ [17, 100, 11, 5] ]
         */
        Scanner scn = new Scanner(System.in);
        int no_of_element = scn.nextInt();
        ArrayList<Integer> aAl = new ArrayList<>();
        for(int i=0; i<no_of_element; i++){
            aAl.add(scn.nextInt());
        }
        int b=scn.nextInt();
        ArrayList<Integer> bAl = new ArrayList<>();
        for(int i=0; i<b; i++){
            bAl.add(scn.nextInt());
        }
        ArrayList<ArrayList<Integer>> rotatedArr = solve(aAl,bAl);
        System.out.print(rotatedArr);
    }

    private static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<B.size(); i++){
            ArrayList<Integer> al = new ArrayList<>(A);
            for(int j=0; j<B.get(i); j++){
                al.add(al.get(0));
                al.remove(0);
            }
            ans.add(al);
        }
        return ans;
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        /*
        Given an array of integers A, of size N.

        Return the maximum size subarray of A having only non-negative elements.
        If there are more than one such subarray, return the one having the smallest starting index in A.

        Input 1:
            A = [5, 6, -1, 7, 8]
        Input 2:
            A = [1, 2, 3, 4, 5, 6]

         Output 1:
            [5, 6]
        Output 2:
            [1, 2, 3, 4, 5, 6]

         */
        Scanner scn =  new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<no_of_elements;i++){
            al.add(scn.nextInt());
        }
        ArrayList<Integer> ansal  = solve(al);
        System.out.print(ansal);
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i)<0){
                count++;
            }
        }
        if(count == 0){
            ans = A;
            return ans;
        }
        int ngIndex = 0;
        for(int i=0; i<A.size(); i++){
            if(A.get(i) < 0){
                ArrayList<Integer> leftArrLst = new ArrayList<>();
                for(int j=ngIndex;j<i;j++){
                    if(A.get(j)>=0){
                        leftArrLst.add(A.get(j));
                    }else{
                        break;
                    }
                }
                ArrayList<Integer> rightArrLst = new ArrayList<>();
                for(int k=i+1; k<A.size(); k++){
                    if(A.get(k)>=0){
                        rightArrLst.add(A.get(k));
                    }else{
                        break;
                    }
                }
                if(ans.size()<leftArrLst.size() || ans.size()<rightArrLst.size()){
                    if(leftArrLst.size() == rightArrLst.size()){
                        ans = leftArrLst;
                    }else if(leftArrLst.size() > rightArrLst.size()){
                        ans = leftArrLst;
                    }else{
                        ans = rightArrLst;
                    }
                }
                ngIndex = i+1;
            }
        }
        return ans;
    }
}

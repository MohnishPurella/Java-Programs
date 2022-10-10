import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*Given an array A of N integers.
        Count the number of elements that have at least 1 elements greater than itself.*/
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<no_of_elements; i++){
            arr.add(scn.nextInt());
        }
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }

    public static int approach1(ArrayList<Integer> A){
        int max = A.get(0);
        for(int i=1; i<A.size(); i++){
            if(max < A.get(i)){
                max = A.get(i);
            }
        }
        int count = 0;
        for(int i=0; i<A.size(); i++){
            if(max == A.get(i)){
                count++;
            }
        }
        return A.size() - count;
    }

    public static int approach2(ArrayList<Integer> A){
        int max = 0;
        int count = 0;
        for(int i = 0; i<A.size(); i++){
            if(A.get(i)>max){
                max = A.get(i);
                count = 1;
            }else if(A.get(i)==max){
                count++;
            }
        }
        return A.size() - count;
    }
}

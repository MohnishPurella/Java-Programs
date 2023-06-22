import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        You're given a read-only array of N integers.
        Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.

        If so, return the integer. If not, return -1.
        If there are multiple solutions, return any one.

        Example Input [1 2 3 1 1]
        Example Output 1
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        int e1 = 0, f1 = 0, e2 = 0, f2= 0;
        for(int i=0; i< A.length; i++){
            if(f1==0 && A[i]!=e2){
                e1 = A[i];
                f1++;
            }else if(A[i]==e1){
                f1++;
            }else if(f2==0){
                e2 = A[i];
                f2++;
            }else if(A[i]!=e1 && A[i]!=e2){
                f1--;
                f2--;
            }else if(A[i]==e2){
                f2++;
            }
        }
        int count1=0, count2=0;
        for(int i=0; i<A.length; i++){
            if(e1==A[i]){
                count1++;
            }else if(e2==A[i]){
                count2++;
            }
        }
        if(count1>A.length/3){
            return e1;
        }else if(count2>A.length/3){
            return e2;
        }
        return -1;
    }
}
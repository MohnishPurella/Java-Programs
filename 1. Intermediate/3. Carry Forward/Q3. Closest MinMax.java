import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        /*
        Given an array A, find the size of the smallest subarray such that it
        contains at least one occurrence of the maximum value of the array
        and at least one occurrence of the minimum value of the array.
        A = [ 814 761 697 483 981 ]
        Output: 2
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0 ; i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        int ans = solve(a);
        System.out.print(ans);
    }

    private static int solve(int[] A) {
        int count = A.length;
        if(A.length == 1) return 1;
        int max = A[0], min = A[0];
        for(int i=0; i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
            if(A[i]<min){
                min = A[i];
            }
        }
        if(max == min) return 1;
        int max_i = -1, min_i = -1;
        for(int i=A.length-1 ; i>=0 ; i--){
            int length = 0;
            if(A[i] == max){
                max_i = i;
                if(min_i!=-1){
                    length = min_i-max_i;
                    if(length<0){
                        length *= -1;
                    }
                    count = Math.min(count, length);
                }
            }else if(A[i]==min){
                min_i = i;
                if(max_i!=-1){
                    length = min_i-max_i;
                    if(length<0){
                        length *= -1;
                    }
                    count = Math.min(count,length);
                }
            }
        }
        return count+1;
    }
}

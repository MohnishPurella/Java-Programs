import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        /*
        Given an array, arr[] of size N,
        the task is to find the count of array indices such that removing an element from these indices
        makes the sum of even-indexed and odd-indexed array elements equal.

        Input 1:
            A=[2, 1, 6, 4]
            
        Input 2:        
            A=[1, 1, 1]
                                    
        Output 1: 1
        Output 2: 3        
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
        int count = 0;
        int ePS[] = new int[A.length], oPS[] = new int[A.length];
        ePS[0] = A[0];
        oPS[0] = 0;
        for(int i=1; i<A.length; i++){
            if(i%2==0){
                ePS[i]=ePS[i-1]+A[i];
            }else{
                ePS[i] = ePS[i-1];
            }
        }
        for(int i=1; i<A.length; i++){
            if(i%2!=0){
                oPS[i]=oPS[i-1]+A[i];
            }else{
                oPS[i] = oPS[i-1];
            }
        }
        for(int i=0; i<A.length; i++){
            if(i==0){
                int se = oPS[A.length-1]-oPS[i];
                int so = ePS[A.length-1]-ePS[i];
                if(se==so){
                    count++;
                }
            }else{
                int se = ePS[i-1]+(oPS[A.length-1]-oPS[i]);
                int so = oPS[i-1]+(ePS[A.length-1]-ePS[i]);
                if(se==so){
                    count++;
                }
            }
        }
        return count;
    }
}

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        /*
        A wire connects N light bulbs.

        Each bulb has a switch associated with it; however, due to faulty wiring,
        a switch also changes the state of all the bulbs to the right of the current bulb.

        Given an initial state of all bulbs,
        find the minimum number of switches you have to press to turn on all the bulbs.

        You can press the same switch multiple times.

        Note: 0 represents the bulb is off and 1 represents the bulb is on.

        A = [0, 1, 0, 1]
        Output: 4

        press switch 0 : [1 0 1 0]
        press switch 1 : [1 1 0 1]
        press switch 2 : [1 1 1 0]
        press switch 3 : [1 1 1 1]
         */
        Scanner scn = new Scanner(System.in);
        int no_of_elements = scn.nextInt();
        int a[] = new int[no_of_elements];
        for(int i=0 ;i<no_of_elements; i++){
            a[i] = scn.nextInt();
        }
        //solve(a);
        System.out.print(solve(a));
    }

    private static int solve(int[] A) {
        int no_of_switches = 0;
        for (int i=0; i<A.length; i++){
            if(no_of_switches%2==0 && A[i]==0 || no_of_switches%2==1 && A[i]==1){
                no_of_switches++;
            }
        }
        return no_of_switches;
    }
}

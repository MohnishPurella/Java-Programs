import java.util.Scanner;

public class Q4RainWaterTrapped {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scn.nextInt();
        }
        int ans = trap(a);
        System.out.println(ans);
    }

    private static int trap(int[] a) {
        int left_support[] = new int[a.length];
        int right_support[] = new int[a.length];
        int net_support[] = new int[a.length];
        int weight[] = new int[a.length];
        left_support[0] = a[0];
        right_support[a.length-1] = a[a.length-1];
        net_support[0] = 0;
        net_support[a.length-1] = 0;
        for(int i=1; i<a.length; i++){
            left_support[i] = Math.max(left_support[i-1],a[i]);
        }
        for(int i=a.length-2; i>=0; i--){
            right_support[i] = Math.max(right_support[i+1],a[i]);
        }
        for(int i=1; i<=a.length-2;i++){
            net_support[i] = Math.min(left_support[i-1], right_support[i+1]);
        }
        weight[0] = 0;
        weight[a.length-1] = 0;
        for(int i=1; i<a.length-1; i++){
            if((net_support[i] - a[i]) >0){
                weight[i] = net_support[i] - a[i];
            }else{
                weight[i] = 0;
            }
        }
        int ans = 0;
        for(int i=0; i<weight.length; i++){
            ans+=weight[i];
        }
        return ans;
    }
}

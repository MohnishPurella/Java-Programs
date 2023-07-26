public class Q5 {
    public static void main(String[] args){
        int n= A.length;
        int[] prefProd= new int[n];
        prefProd[0]=1;
        for(int i=1;i<n;i++){
            prefProd[i]= prefProd[i-1]*A[i-1];
        }
        int [] suffProd= new int[n];
        suffProd[n-1]=1;
        for(int i=n-2;i>=0;i--){
            suffProd[i]=suffProd[i+1]*A[i+1];
        }
        int []outArr= new int[n];
        for(int i=0;i<n;i++){                      
            outArr[i]=prefProd[i]*suffProd[i];
        }
        return outArr;
    }
}

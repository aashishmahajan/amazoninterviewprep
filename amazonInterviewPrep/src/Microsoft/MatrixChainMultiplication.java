package Microsoft;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[][] a = new int[2][3];
        int[][] b = new int[2][4];
        int[][] c = new int[3][2];

        for(int i = 0; i < a.length; i++){
            for(int j=0; j <a[0].length; j++ ){
                a[i][j] = i+j;
            }
        }
        for(int i = 0; i < b.length; i++){
            for(int j=0; j <b[0].length; j++ ){
                b[i][j] = i+j;
            }
        }
        for(int i = 0; i < c.length; i++){
            for(int j=0; j < c[0].length; j++ ){
                c[i][j] = i+j;
            }
        }
        findEfficientMultiplication(a, b,c,3);
        int arr[] = {4,2,3,5,3,3};
        findCost(arr);
    }

    private static int findCost(int[] arr) {
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l=2; l < arr.length; l++){
            for(int i=0; i < arr.length - l; i++){
                int j = i + l;
                temp[i][j] = 1000000;
                for(int k=i+1; k < j; k++){
                    q = temp[i][k] + temp[k][j] + arr[i]*arr[k]*arr[j];
                    if(q < temp[i][j]){
                        temp[i][j] = q;
                    }
                }
            }
        }
        System.out.println(temp[0][arr.length-1]);
        return temp[0][arr.length-1];
    }

    private static void findEfficientMultiplication(int[][] a, int[][] b, int[][] c, int n) {
        int arow = a.length;
        int acol = a[0].length;

        int brow = b.length;
        int bcol = b[0].length;

        int crow = c.length;
        int ccol = c[0].length;

        int[][] rslt = new int[n][n];
        for(int i =0 ; i <n; i++){
            for(int j=0; j <n; j++){
                if(i==j){
                rslt[i][j] =1;
                }
            }
        }
        int length=n-1;
        /*while(length > 0){
            for(int i=0; i <=length-i; i++){

            }
        }*/
    }
}

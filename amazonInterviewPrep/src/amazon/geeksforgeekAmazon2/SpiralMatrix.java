package geeksforgeekAmazon2;

public class SpiralMatrix {
    static int[][] inp ;
    static int r =4;
    static int c=4;

    public static void main(String[] args) {
        inp = new int[][]
                {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        printSpiral(inp);
    }

    private static void printSpiral(int[][] inp) {
        int i ;
        int k=0, l=0;
        while(k < r && l < c) {
            for (i = 0; i < c; i++) {
                System.out.println(inp[k][i]);
            }
            k++;
            for (i = 1; i < r; i++) {
                System.out.println(inp[i][c-1]);
            }
            c--;
            if (k < r) {
                for (i = c - 1; i >= 1; --i) {
                    System.out.println(inp[r - 1][i]);
                }
                r--;
            }
            if (l < c) {
                for (i = r - 1; i >= k; --i) {
                    System.out.println(inp[i][l]);
                }
                l++;
            }
        }
    }
}

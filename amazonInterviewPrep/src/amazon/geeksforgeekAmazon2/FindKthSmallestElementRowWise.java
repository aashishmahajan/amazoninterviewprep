package geeksforgeekAmazon2;

import java.util.Arrays;
import java.util.Collections;

public class FindKthSmallestElementRowWise {
    public static int findXmini(int[][]inp, int x, int row, int col){
        int[] inpArray = new int[x];
        int count =0;
        int i = 0;
        int j = 0;
        inpArray[count] = inp[i][j];
        count++;
        while(count<x){
            int b= findMin(inp, i, j, row, col);
        }

        return 0;

    }

    private static int findMin(int[][] inp, int i, int j, int row, int col) {
        int s = i;
        int[] inpa = new int[row];
        while (s+1 < row){
            inpa[s] = inp[s+1][j];
        }
        inpa[inp.length] = inp[i][j+1];

        Arrays.sort(inp);
        return inpa[0];
    }

    public static void main(String[] args) {
        int[][] inp =new int[][]{{10,20,30,40},
                                {15,25,35,45},
                                {24,29,37,48},
                                {32,33,39,40}};
        findXmini(inp, 3 , 4, 4);
    }
}

package prep2;

import java.util.*;

public class InorderPostorderTreeeGrow {
    static void createTree(int[] in, int[] pst, int start, int end , int value){
        int root = pst[end - 1];
        int middle = -1;
        if (end - start != 1) {
            middle = start + value + (int) Math.ceil((end - start) / 2);
        }
        System.out.println(root);
        if (middle != -1) {
            if ((start != middle - value) && (middle - value != 0)) {
                System.out.println("");
                createTree(in, pst, start, middle - value, 0);
            }
            if ((middle - value != end - 1) && (end - 1 != 0)) {
                System.out.println("");
                createTree(in, pst, middle - value, end - 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] in = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int[] pst = new int[]{8, 4, 5, 2, 6, 7, 3, 1};

        createTree(in, pst, 0 ,pst.length, 0);

    }
}

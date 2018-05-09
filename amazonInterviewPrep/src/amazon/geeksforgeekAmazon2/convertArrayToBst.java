package geeksforgeekAmazon2;

import java.util.Arrays;

public class convertArrayToBst {
    Tree root;
    static int ind;
    convertArrayToBst(){
        root = null;
        ind =0;
    }
    Tree createTree(int[] inp, int start , int end){
        if(start > end){
            return null;
        }
        int mid = (end + start) / 2;
        Tree root = new Tree(inp[mid]);
        root.left = createTree(inp, start, mid);
        root.right = createTree(inp, mid+1, end);
        return root;
    }
    public static void main(String[] args) {
        int[] inp = {10,1,2,12,4,17,12,19};
        Arrays.sort(inp);
        convertArrayToBst  c  = new convertArrayToBst();

        c.createTree(inp, 0, inp.length-1);

    }
}

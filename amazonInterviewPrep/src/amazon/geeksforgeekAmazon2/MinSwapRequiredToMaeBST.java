package geeksforgeekAmazon2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinSwapRequiredToMaeBST {
    static int MinSwap = 0;
    static int ind = 0;
    static List<Integer> LIST= new LinkedList<>();
    Tree root;

    MinSwapRequiredToMaeBST(){
        root = null;
    }
    public static void main(String[] args) {
        MinSwapRequiredToMaeBST m = new MinSwapRequiredToMaeBST();
        Size s = new Size();
        m.root = new Tree(5, s);
        m.root.left = new Tree(6, s);
        m.root.left.left = new Tree(8, s);
        m.root.left.right = new Tree(9, s);

        m.root.right = new Tree(7, s);
        m.root.right.left= new Tree(10, s);
        m.root.right.right= new Tree(11, s);
        System.out.println("amazon.tree :");
        m.inOrder(m.root);

        m.mergeSort(LIST);

        Collections.sort(LIST);

        checkHowManySwap(m.root);
        System.out.println("\namazon.tree :");
        m.inOrder(m.root);
        /*System.out.println(MinSwap);*/

    }

    public static int[] mergeSort(List<Integer> list) {
        if(list ==null){
            return null;
        }
        if(list.size()==1){
            int[] a= new int[list.size()];
            a[0] = list.get(0);
            return a;
        } if(list.size()==2){
            int[] a= new int[list.size()];
            if(list.get(0)<list.get(1)){
                a[0] = list.get(1);
                a[1] = list.get(0);
            }else{
                a[0] = list.get(0);
                a[1] = list.get(1);
            }
            return a;
        }
        int[] a = new  int[list.size()];
        for(int i=0; i <list.size(); i ++){
            a[i] = list.get(i);
        }
        int mid = list.size()-0/2;
        merge(a, 0, mid,list.size());
        return null;
    }

    private static void merge(int[] a, int start, int mid, int end) {
    }

    private static void checkHowManySwap(Tree root) {
        if(root ==null){
            return;
        }
        if(root.left != null){
            checkHowManySwap(root.left);
        }
        if(root.data != LIST.get(ind)){
            MinSwap++;
            root.data = LIST.get(ind);
        }
        ind++;
        checkHowManySwap(root.right);
    }

    private void inOrder(Tree root) {
        if(root ==null ){
            return;
        }
        if(root.left!=null){
            inOrder(root.left);
        }
        System.out.print(root.data +" ");
        LIST.add(root.data);
        inOrder(root.right);
    }
}

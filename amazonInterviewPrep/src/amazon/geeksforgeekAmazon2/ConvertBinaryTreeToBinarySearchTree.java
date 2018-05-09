package geeksforgeekAmazon2;

import java.util.*;

public class ConvertBinaryTreeToBinarySearchTree {
    Tree root;
    int[] inp;
    static List<Integer> LIST = new LinkedList<>();
    static int i=0;
    ConvertBinaryTreeToBinarySearchTree(){
        root = null;
    }

    public static void main(String[] args) {
        ConvertBinaryTreeToBinarySearchTree c = new ConvertBinaryTreeToBinarySearchTree();
        Size  s = new Size();
        c.root = new Tree(10, s);
        c.root.left = new Tree(17, s);
        c.root.left.right = new Tree(26, s);
        c.root.left.left = new Tree(1, s);
        c.root.right = new Tree(8, s);
        c.root.right.left= new Tree(7, s);
        c.root.right.right= new Tree(23, s);

/*        System.out.println("size "+s.size+"\n");*/
        c.inp = new int[s.size];
        c.inorderTreeTraverse(c.root);
       /* System.out.println("\ntraversed Element");*/
        /*for(int i : LIST){


        }*/
        Collections.sort(LIST);

        c.update(c.root);

        System.out.println("here");
        /*c.inorderTreeTraverse(c.root);*/
    }

    private void update(Tree root) {
        if(root==null){
            return;
        }
        if(root.left !=null){
            update(root.left);
        }
        root.data = LIST.get(i); i++;
        update(root.right);
    }

    private void inorderTreeTraverse(Tree root) {
        if(root==null){
            return;
        }

        if(root.left !=null){ inorderTreeTraverse(root.left);}
        /*System.out.println(root.data);*/
        LIST.add(root.data);
        inorderTreeTraverse(root.right);
    }
}

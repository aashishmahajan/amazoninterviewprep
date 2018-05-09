package prep2;
/*
* preorder : root is a t first,
* break down till first element greater than root,
* anything between root and i is left amazon.tree, and i+1 is right
* */


import java.util.Arrays;


public class TreeFromPreorder {
    Node root;

    static class Index{
        int index =0;
    }
    Index index  = new Index();

    Node generateTreeFrom(int[] inp, int inplength){

        return generateTreeFrom(inp, index , 0, inplength-1, inplength);
    }

    Node generateTreeFrom(int[] inp, Index index, int low, int high, int length){

        if(index.index >= length || low >high){
            return null;
        }
        Node root = new Node(inp[index.index]);
        index.index++;

        if(low == high){
            return root;
        }
        int i ;
        for(i =low ; i<= high;i++){
            if(inp[i] >  root.data){
                break;
            }
        }
        root.left = generateTreeFrom(inp, index, index.index, i-1,length);
        root.right = generateTreeFrom(inp, index, i, high,length);
        return root;
    }
    void display(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        if(root.left !=null){
            display(root.left);
        }
        display(root.right);
    }

    public static void main(String[] args) {
        int[] inp ={10, 5, 1, 7, 40, 50};
        TreeFromPreorder tree = new TreeFromPreorder();
        Node root = tree.generateTreeFrom(inp,inp.length);
        tree.display(root);
    }
}

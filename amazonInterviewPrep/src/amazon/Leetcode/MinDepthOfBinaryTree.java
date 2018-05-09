package Leetcode;
class Height{
    int height ;
    Height(){
        height = 0;
    }
}

class Tree{
    Tree right,left;
    int data;
    Tree (int data) {
        this.data = data;
        right=left=null;
    }
}
public class MinDepthOfBinaryTree {
    Tree root;
    MinDepthOfBinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        MinDepthOfBinaryTree t = new MinDepthOfBinaryTree();
        t.root = new Tree(1);
        t.root.left= new Tree(2);
        t.root.right = new Tree(3);

        t.root.left.left = new Tree(4);
        t.root.left.right = new Tree(5);

/*        System.out.println(getDepth(t.root));*/

    }

    private static int getDepth(Tree root) {
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.right == null){
            return getDepth(root.left) + 1;
        }
        if(root.left == null){
            return getDepth(root.right) + 1;
        }
        return Math.min(getDepth(root.left),getDepth(root.right))+1;
    }

    static int getHeight(Tree root){
        if(root ==null){
            return 0;
        }
        return Math.min(getHeight(root.left),getHeight(root.right))+1;
    }
}

package yahoo;

public class serializeDesiralize {
    Tree root;
    String inorder ;
    String postOrdr ;
    serializeDesiralize () {
        root = null;
        inorder = "";
        postOrdr = "";
    }

    void inorder(Tree root) {
        if(root ==null){
            return;
        }
        System.out.print(root.data+ " ");
        inorder += root.data;
        if (root.left != null) {
            inorder( root.left );
        }
        inorder( root.right );

    }

    void postOrder (Tree root) {
        if(root ==null){
            return;
        }
        if (root.right!= null) {
            postOrder( root.right);
        }
        System.out.print(root.data+ " ");
        postOrdr += root.data;
        postOrder(root.left);
    }

    void serialize(Tree root){
        inorder(root);
        System.out.println();
        postOrder(root);
    }

    private void deserialize(Tree root) {

    }

    public static void main(String[] args) {
        serializeDesiralize s = new serializeDesiralize();
        s.root = new Tree(6);
        s.root.left = new Tree(3);
        s.root.left.right = new Tree(4);
        s.root.left.right.right  = new Tree(5);
        s.root.left.left = new Tree(2);
        s.root.left.left.left = new Tree(1);

        s.root.right = new Tree(8);
        s.root.right.left = new Tree(7);
        s.root.right.right  = new Tree(9);
        s.serialize(s.root);

        s.deserialize(s.root);
    }
}

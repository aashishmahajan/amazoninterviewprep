package prep2;

/*
 * traverse root,
 * traverse all left
 * traverse all right
 *
 *  */
public class PreOrderTraversal {
    Node root;

    PreOrderTraversal(){
        root = null;
    }

    void printPreorder(Node root){
        if  (root == null)  {
            return;
        }
        System.out.println(root.data);
        if(root.left != null){
            printPreorder(root.left);
        }
        printPreorder(root.right);
    }

    void postOrder(Node root){
        if(root ==null){
            return;
        }

        if(root.right != null){
            postOrder(root.right);
        }
        postOrder(root.left);
        System.out.println(root.data);
    }

    public static void main(String[] args) {
        PreOrderTraversal tree1 = new PreOrderTraversal();
        tree1.root = new Node(1);
        tree1.root.left = new Node(10);
        tree1.root.right = new Node(20);
        tree1.root.left.left = new Node(5);
        tree1.root.left.right= new Node(12);
        tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(7);

        tree1.printPreorder(tree1.root);
        System.out.println("");
        tree1.postOrder(tree1.root);

    }
}

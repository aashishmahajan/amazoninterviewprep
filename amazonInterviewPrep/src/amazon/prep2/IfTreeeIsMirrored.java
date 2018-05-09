package prep2;

public class IfTreeeIsMirrored {
    Node root;
    IfTreeeIsMirrored(){
        this.root = null;
    }

    static boolean isMirror(Node root1, Node root2){
        // empty amazon.tree is mirrored
        if(root1 == null && root2 == null){
            return true;
        }

        // either non empty amazon.tree is not mirrored
        if(root1 == null || root2 == null){
            return false;
        }

        //compare value, recursive call on left vs right/ right vs, left
        return (root1.data == root2.data && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left));
    }


    public static void main(String[] args) {
        IfTreeeIsMirrored  tree1 = new IfTreeeIsMirrored();

        tree1.root = new Node(3);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(5);
        tree1.root.left.left = new Node(1);
        tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(7);

        /*
               3
              /\
             2  5
            /  / \
           1   4  7
                         */

        IfTreeeIsMirrored  tree2 = new IfTreeeIsMirrored();
        tree2.root = new Node(3);
        tree2.root.right = new Node(2);
        tree2.root.left = new Node(5);
        tree2.root.right.right = new Node(1);
        tree2.root.left.right = new Node(4);
        tree2.root.left.left = new Node(7);
        /*
               3
              /\
             5  2
            / \  \
           7   4  1
                         */
        System.out.println(isMirror(tree1.root, tree2.root));

    }
}

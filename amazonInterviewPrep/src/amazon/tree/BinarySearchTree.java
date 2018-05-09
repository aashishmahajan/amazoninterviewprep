package tree;
    class Nodeee {

        int data;
        Nodeee left, right;

        Nodeee(int d){
            data = d;
            left = right = null;
        }
    }

    class BinarySearchTree {

        // Root of BST
        Nodeee root;

        // Constructor
        BinarySearchTree()
        {
            root = null;
        }

        // Inorder traversal of the amazon.tree
        void inorder()
        {
            inorderUtil(this.root);
        }

        // Utility function for inorder traversal of
        // the amazon.tree
        void inorderUtil(Nodeee nodee)
        {
            if (nodee == null)
                return;

            inorderUtil(nodee.left);
            System.out.print(nodee.data + " ");
            inorderUtil(nodee.right);
        }

        // adding new nodee
        public void insert(int data)
        {
            this.root = this.insertRec(this.root, data);
        }

        /* A utility function to insert a new nodee with
        given data in BST */
        Nodeee insertRec(Nodeee nodee, int data)
        {
            /* If the amazon.tree is empty, return a new nodee */
            if (nodee == null) {
                this.root = new Nodeee(data);
                return this.root;
            }

            /* Otherwise, recur down the amazon.tree */
            if (data <= nodee.data) {
                nodee.left = this.insertRec(nodee.left, data);
            } else {
                nodee.right = this.insertRec(nodee.right, data);
            }
            return nodee;
        }

        // This class initialises the value of sum to 0
        public class Sum {
            int sum = 0;
        }

        // Recursive function to add all greater values in
        // every nodee
        void modifyBSTUtil(Nodeee nodee, Sum S)
        {
            // Base Case
            if (nodee == null)
                return;

            // Recur for right subtree
            this.modifyBSTUtil(nodee.right, S);

            // Now *sum has sum of nodeees in right subtree, add
            // root->data to sum and update root->data
            S.sum = S.sum + nodee.data;
            nodee.data = S.sum;

            // Recur for left subtree
            this.modifyBSTUtil(nodee.left, S);
        }

        // A wrapper over modifyBSTUtil()
        void modifyBST(Nodeee nodee)
        {
            Sum S = new Sum();
            this.modifyBSTUtil(nodee, S);
        }

        // Driver Function
        public static void main(String[] args)
        {
            BinarySearchTree tree = new BinarySearchTree();

                /* Let us create following BST
                    50
                /	 \
                30	 70
                / \ / \
            20 40 60 80 */

            tree.insert(50);
            tree.insert(30);
            tree.insert(20);
            tree.insert(40);
            tree.insert(70);
            tree.insert(60);
            tree.insert(80);

            tree.inorder();
            System.out.println("\n");
            tree.modifyBST(tree.root);

            // print inodeer tarversal of the modified BST
            tree.inorder();
        }
    }

// This code is contributed by Kamal Rawal


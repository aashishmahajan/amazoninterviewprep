package prep2;

public class addSumToAllNode{
    Node root;
    addSumToAllNode(){
        root = null;
    }

    void insert(int data){
        root = insert(this.root, data);
    }

    Node insert(Node root, int data){
        if(root ==null){
            root = new Node(data);
            return root;
        }

        if(data <= root.data){
            root.left = insert(root.left, data);
        }else{
            root.right = insert(root.right, data);
        }
        return root;
    }

    void inorder(){
        inorder(root);
    }
    void inorder(Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    class Sum{
        int sum = 0;
    }
    void modifyTree(Node root){
        Sum s = new Sum();
        modifyTree(root, s);
    }

    void modifyTree(Node root, Sum s){
        if(root == null){
            return;
        }
        modifyTree(root.right, s);

        s.sum = s.sum + root.data;
        root.data = s.sum;

        modifyTree(root.left,s);

    }

    public static void main(String[] args) {
        addSumToAllNode tree = new addSumToAllNode();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();

        tree.modifyTree(tree.root);
        System.out.println("\n");
        tree.inorder();
    }
}
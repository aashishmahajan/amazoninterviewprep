package prep2;

public class FindAncestor {

    Node root;

    FindAncestor(){
        this.root = null;
    }
    void findAncestorFor(int data){
        findAncestorFor(this.root, data);
    }

    boolean findAncestorFor(Node root, int data){
        if(root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(findAncestorFor(root.left, data) || findAncestorFor(root.right, data)){
            System.out.println(root.data);
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        FindAncestor  tree = new FindAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(7);


        tree.findAncestorFor(7);
    }
}

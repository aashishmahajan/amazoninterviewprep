package prep2;

public class HeightOfTreee {
    Node root;

    HeightOfTreee(){
        root = null;
    }

    int calHeight(Node root){
        if(root ==null){
            return 0;
        }

        int leftHeight = calHeight(root.left);
        int rightHeight = calHeight(root.right);

        return (leftHeight>rightHeight ? leftHeight: rightHeight) +1;
    }
    public static void main(String[] args) {
        HeightOfTreee tree1 = new HeightOfTreee();
        tree1.root = new Node(1);
        tree1.root.left = new Node(10);
        tree1.root.right = new Node(20);
        tree1.root.left.left = new Node(5);
        tree1.root.left.right= new Node(12);
        tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(7);

        System.out.println(tree1.calHeight(tree1.root));
    }
}

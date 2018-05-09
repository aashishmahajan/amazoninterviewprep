package prep2;

public class LevelOrderTraversal {
    Node root;

    LevelOrderTraversal(){
        this.root = null;
    }


    int height(Node root){
        if(root == null ){
            return 0;
        }else {
            int lheight = height(root.left);
            int rheight = height(root.right);
            return (lheight > rheight ? lheight : rheight) + 1;
        }
    }
    void traverseLevel(){
        int height = height(root);
        for(int i =1; i <= height; i++){
            traverseLevel(this.root, i);
        }
    }
    void traverseLevel(Node root, int height){
        if(root == null){
            return;
        }

        if(height == 1){
            System.out.print(root.data + "\n");
        }
        else if(height > 1){
            traverseLevel(root.left, height - 1);
            traverseLevel(root.right, height - 1);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal tree= new LevelOrderTraversal();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        tree.traverseLevel();

    }

}

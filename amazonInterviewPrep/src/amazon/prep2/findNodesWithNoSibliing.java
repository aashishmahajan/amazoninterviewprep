package prep2;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class findNodesWithNoSibliing {
    Node root;

    findNodesWithNoSibliing (){
        this.root = null;
    }

    void findNodewithNoSib (Node root){
        if(root == null ){
            return;
        }
        if(root.left != null && root.right !=null){
            findNodewithNoSib(root.left);
            findNodewithNoSib(root.right);
        }

        else if (root.right !=null){
            System.out.println(root.right.data+ " ");
            findNodewithNoSib(root.right);
        }else if(root.left !=null ){
            System.out.println(root.left.data+ " ");
            findNodewithNoSib(root.left);
        }
    }


    public static void main(String[] args) {
        findNodesWithNoSibliing  tree = new findNodesWithNoSibliing();
        tree.root = new Node(7);
        tree.root.left = new Node(5);
        tree.root.right = new Node(8);
        /*amazon.tree.root.left.left = new Node(3);*/
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(11);
        tree.findNodewithNoSib(tree.root);

    }
}

package prep2;

public class SumTree {
    Node root;

    SumTree(){
        this.root = null;
    }


    int isSum(Node root){
        if(root == null){
            return 0;
        }
        return isSum(root.left) + root.data + isSum(root.right);
    }

    boolean isSumTree (Node root){
        int leftS,rightS ;
        if(root ==null && root.left ==null && root.right ==null){
            return true;
        }

        leftS = isSum(root.left);
        rightS = isSum(root.right);
        /*
        System.out.println(leftS);
        System.out.println(rightS);
        */
        if((root.data == leftS+rightS) && isSum(root.left)!=0 && isSum(root.right)!= 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        SumTree tree = new SumTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.left= new Node(1);
        tree.root.right.right= new Node(2);

        System.out.println(tree.isSum(tree.root));
        System.out.println(tree.isSumTree(tree.root));
    }

}

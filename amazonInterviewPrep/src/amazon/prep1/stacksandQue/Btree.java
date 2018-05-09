package prep1.stacksandQue;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
        left=right =null;
    }
}

class Height{
    int height =0;
}
public class Btree {
    Node root;

    static public boolean isBalc(Node root, Height height){
        if(root == null ){
            if (height.height ==0){
                return true;
            }
        }

        Height lheight = new Height();
        Height rheight = new Height();

        boolean l = isBalc(root.left, lheight);
        boolean r = isBalc(root.right,rheight);


        int lh = lheight.height, rh =rheight.height;
        height.height = (lh > rh?lh:rh)+1;

        if(lh-rh >=2 || rh-lh >=2){
            return false;
        }

        return l&&r;
    }
    int height(Node root){
        if(root == null ){
            return 0;
        }
        return 1 + Math.max(height(root.left) , height(root.right));
    }


    public static void main(String[] args) {

        Height height = new Height();
         /* Constructed binary amazon.tree is
                   1
                 /   \
                2      3
              /  \    /
            4     5  6
            /
           7         */
        Btree tree = new Btree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left =new Node (4);
        tree.root.left.right =new Node (5);
        tree.root.left.left.left =new Node (7);
        if(isBalc(tree.root, height)){
             System.out.println("amazon.tree is balanced");
        }

    }
}

package prep2;

public class CountNumberOfLeaves {
    Node root;
    CountNumberOfLeaves(){
        root = null;
    }

    void countLeaves(Node root, Count count){
        if(root == null ){
            return;
        }
        else if(root.left == null || root.right == null){
            count.count++;
        }
        else{
            countLeaves(root.right, count) ;
            countLeaves(root.left, count);
        }

    }

    public static void main(String[] args) {
        CountNumberOfLeaves tree1 = new CountNumberOfLeaves();
        Count count  = new Count();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right= new Node(5);
        /*tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(7);*/
        tree1.countLeaves(tree1.root, count);

        System.out.println(count.count);
    }
}

package prep2;

class Count{
    int count;
    Count(){
        count = 0;
    }
}
public class CountNumberOfNodes {
    Node root;

    void countNode(Node root, Count count) {
        if(root == null){
            return;
        }
        /*count.count ++;
        if(root.left != null) {
            countNode( root.left, count);
        }
        countNode(root.right, count);
        */
        count.count++;
        if(root.right != null){
            countNode( root.right, count);
        }
        countNode( root.left, count);
    }



    public static void main(String[] args) {
        CountNumberOfNodes  tree1= new CountNumberOfNodes();
        Count count = new Count();
        tree1.root = new Node(1);
        tree1.root.left = new Node(10);
        tree1.root.right = new Node(20);
        tree1.root.left.left = new Node(5);
        tree1.root.left.right= new Node(12);
        tree1.root.right.left = new Node(4);
        tree1.root.right.right = new Node(7);

        tree1.countNode(tree1.root, count);
        System.out.println(count.count);

    }

}

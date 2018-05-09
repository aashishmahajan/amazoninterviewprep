package yahoo;

class Tree{
    int data;
    Tree left,right;

    Tree(int data){
        this.data = data;
        left = right = null;
    }
}
public class findDeepestNode {
    Tree root;

    findDeepestNode(){
        root = null;
    }

    public int findDepth(Tree root){
        if(root ==null){
            return 0;
        }else{
            int lh = findDepth(root.left);
            int rh = findDepth(root.right);

            return lh > rh ? lh+1: rh+1;
        }
    }

    public static void main(String[] args) {
        findDeepestNode f = new findDeepestNode();
        f.root = new Tree(7);
        f.root.left = new Tree(3);
        f.root.right = new Tree(4);

        f.root.left.left  = new Tree(1);
        f.root.left.right = new Tree(2);
        f.root.left.left.left  = new Tree(11);
        f.root.right.left = new Tree(5);
        f.root.right.right = new Tree(8);
        f.root.right.right.left = new Tree(13);

        int height = f.findDepth(f.root);
        findNodeAtDept(height-1, f.root,0);
    }

    private static void findNodeAtDept(int height, Tree root, int level) {
        if(root==null && level == height){
            return;
        }else {
            if(level != height){
                findNodeAtDept(height, root.left ,level+1);
                findNodeAtDept(height, root.right ,level+1);
            }else{
                System.out.print(root.data+ " ");
            }
        }
    }
}

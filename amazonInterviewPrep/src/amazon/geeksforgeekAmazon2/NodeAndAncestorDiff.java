package geeksforgeekAmazon2;

class Res{
        int res = Integer.MIN_VALUE;
}
public class NodeAndAncestorDiff{
    Tree root;
    NodeAndAncestorDiff (){
            root =null;
    }
    public int maxDiff(Tree root){
            Res res = new Res();
            findMax(root, res);
            return res.res;
    }

        private int findMax(Tree root, Res res) {
            if(root ==null){
                    return Integer.MAX_VALUE;
            }
            if(root.left==null && root.right==null){
                    return root.data;
            }
            int val = Math.min(findMax(root.left, res), findMax(root.right, res));

            res.res = Math.max(res.res, root.data-val);

            return Math.min(val, root.data);
        }

        public static void main(String[] args){
        NodeAndAncestorDiff tree = new NodeAndAncestorDiff();

        // Making above given diagram's binary amazon.tree
        tree.root = new Tree(8);
        tree.root.left = new Tree(3);
        tree.root.left.left = new Tree(1);
        tree.root.left.right = new Tree(6);
        tree.root.left.right.left = new Tree(4);
        tree.root.left.right.right = new Tree(7);

        tree.root.right = new Tree(10);
        tree.root.right.right = new Tree(14);
        tree.root.right.right.left = new Tree(13);

        System.out.println("Maximum difference between a node and"
        + " its ancestor is : " + tree.maxDiff(tree.root));
}
}
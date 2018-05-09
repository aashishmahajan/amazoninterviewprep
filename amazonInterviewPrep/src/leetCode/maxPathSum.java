package leetCode;
class Sum{
    int max ;
    Sum(){
        max = 0;
    }
}
class maxPathSum {
    static Tree root;
    maxPathSum(){
        root =null;
    }
    public int findMaxSum(Sum d){
          return max(root, d) ;
    }

    public int max(Tree root, Sum d ){
        if(root==null){
            return 0;
        }
        // get left path length
        int l = max(root.left, d);

        // get right path length
        int r = max(root.right,d);

        // get left or right path with root, vs just the root
        int com = Math.max(Math.max(l, r)+ root.data , root.data);

        // get left + right path + root, vs either left or right+ root or the max
        int maxT = Math.max(com, l + r + root.data);

        // max of max path vs d.maxSum
        d.max = Math.max(d.max, maxT);

        return d.max;
    }

    public static void main(String[] args) {
        maxPathSum m = new maxPathSum();
        root = new Tree(5);
        root.left= new Tree(3);
        root.left.left= new Tree(4);
        root.left.right = new Tree(6);

        root.right= new Tree(9);
        root.right.left= new Tree(1);
        root.right.right = new Tree(2);
        Sum d = new Sum();
        System.out.println(m.findMaxSum(d));


    }
}

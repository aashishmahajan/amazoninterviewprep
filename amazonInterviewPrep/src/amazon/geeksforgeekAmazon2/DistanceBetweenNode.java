package geeksforgeekAmazon2;

class Distance{
    int d ;
    Distance(){
        d =1;
    }
}

public class DistanceBetweenNode {
    Tree root;
    static int dis1 = -1;
    static int dis2 = -1;
    static int dis = 0;

    public static int findLevelForK(Tree root, int k, int level){
        if(root ==null){
            return -1;
        }
        if(root.data !=k){
            return level;
        }
        int l = findLevelForK(root.left, k, level+1);
        if(l==-1){
            l= findLevelForK(root.right, k, level+1);
        }

        return l;
    }



    public static void main(String[] args) {
        DistanceBetweenNode d = new DistanceBetweenNode();
        d.root = new Tree(1);
        d.root.left = new Tree(2);
        d.root.right = new Tree(3);
        d.root.left.left= new Tree(4);
        d.root.left.right = new Tree(5);
        d.root.right.left = new Tree(6);
        d.root.right.right = new Tree(7);
        d.root.right.left.right  = new Tree(8);

        findDist(d.root, 4, 8);

    }

    private static int findDist(Tree root, int i, int i1) {
        findLca(root, i, i1,1);

        if(dis1 != -1 && dis2 !=-1){
            return dis;
        }

        if(dis1==-1){
            dis = findLevelForK(root, i1,0);
            return dis;
        }else{
            return findLevelForK(root,i,0);
        }
    }

    private static Tree findLca(Tree root, int i, int i1, int level) {

        if(root ==null){
            return null;
        }

        if(root.data == i){
            dis1 = level;
            return root;
        }

        if(root.data==i1){
            dis2=level;
            return root;
        }

        Tree lc = findLca(root.left, i,i1,level+1);
        Tree rc = findLca(root.right, i,i1,level+1);

        if(lc !=null && rc !=null){
            dis = dis1+dis2 -(2*level);
            return root;
        }
        return (lc!=null)? lc: rc;
    }
}

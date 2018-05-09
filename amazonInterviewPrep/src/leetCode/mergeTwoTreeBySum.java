package leetCode;

class  Tree{
    int data;
    Tree left,right;
    Tree(int data){
        this.data = data;
        left= right=null;
    }
}
public class mergeTwoTreeBySum {
    static Tree root1;
    static Tree root2;
    mergeTwoTreeBySum(){
        root1 = root2 = null;
    }

    static Tree merge(){
        mergeTree(root1, root2);
        print(root1);
        return root1;
    }

    private static void print(Tree root1) {
        if(root1 ==null){
            return;
        }
        print(root1.left);
        System.out.println(root1.data);
        print(root1.right);
    }

    static public Tree mergeTree(Tree rootA, Tree rootB){
        if(rootA==null){
            return rootB;
        }
        if(rootB == null){
            return rootA;
        }
        rootA.data += rootB.data;
        rootA.left = mergeTree(rootA.left,rootB.left);
        rootA.right = mergeTree(rootA.right,rootB.right);
        return rootA;
    }

    public static void main(String[] args) {
        mergeTwoTreeBySum m = new mergeTwoTreeBySum();
        root1 = new Tree(2);
        root1.left = new Tree(1);
        root1.right = new Tree(4);
        root1.left.left = new Tree(5);

        root2 = new Tree(3);
        root2.left = new Tree(6);
        root2.left.right = new Tree(2);
        root2.right = new Tree(1);
        root2.right.right = new Tree(7);

        print(mergeTree(root1,root2));
    }

}

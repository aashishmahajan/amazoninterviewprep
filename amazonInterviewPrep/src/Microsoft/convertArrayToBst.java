package Microsoft;
class Tree{
    int data;
    Tree left,right;
    Tree(int data){
        this.data = data;
        left=right=null;
    }
}
public class convertArrayToBst {
    static Tree root;
    public static void main(String[] args) {
        int[] inp = {1,2,3,4};
        /*int middle = inp.length%2 ==0 ? inp.length/2: (int)Math.ceil(inp.length/2);*/
        root = convertToBst(inp, inp.length-1,0);
        printInorder(root);
    }

    private static void printInorder(Tree root) {
        while(root==null){
            return;
        }
        System.out.println(root.data);
        if(root.left!=null){
            printInorder(root.left);
        }
        printInorder(root.right);
    }

    private static Tree convertToBst(int[] inp, int end, int start) {
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Tree roots =new Tree(inp[mid]);
        roots.left = convertToBst(inp,mid-1,start);
        roots.right = convertToBst(inp,end,mid+1);

        return roots;
    }
}

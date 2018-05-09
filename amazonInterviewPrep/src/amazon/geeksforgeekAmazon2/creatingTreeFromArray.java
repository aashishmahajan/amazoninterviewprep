package geeksforgeekAmazon2;

public class creatingTreeFromArray {
    Tree root ;
    static int ind=0;

    creatingTreeFromArray(){
        root =null;
    }
    public static void main(String[] args) {
        creatingTreeFromArray  c = new creatingTreeFromArray();
        int[] inp = {1,2,3,4,5,6,7};

        c.root = c.createTree(inp, c.root,  0);
        c.print(c.root);
    }

    private Tree createTree( int[] arr, Tree root, int i) {
        // Base case for recursion
        if (i < arr.length) {
            Tree temp = new Tree(arr[i]);
            root = temp;

            // insert left child
            root.left = createTree(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = createTree(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    public void print(Tree root){
        if(root == null){
            return;
        }
        if(root.left !=null){
            print(root.left);
        }
        System.out.println(root.data);
        print(root.right);
    }
}

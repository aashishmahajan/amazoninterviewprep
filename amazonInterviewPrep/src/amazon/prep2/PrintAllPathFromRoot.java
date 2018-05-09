package prep2;

public class PrintAllPathFromRoot {
    Node root;
    int count ;

    PrintAllPathFromRoot(){
        this.root = null;
        count =0;
    }

    void findPathFromRoot(){
        int[] paths = new  int[1000];
        findPathFromRoot(root,paths, 0);

    }
    void findPathFromRoot(Node root, int[] paths, int index){
        if(root == null){
            return;
        }

        paths[index] = root.data;
        index++;

        if(root.left == null && root.right ==null){
            print(paths,index);
        }
        else{
            findPathFromRoot(root.left, paths, index);
            findPathFromRoot(root.right, paths, index);
        }
    }

    void print(int[] paths,int len){
        for(int i =0; i < len; i++){
            System.out.print(paths[i]);
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        PrintAllPathFromRoot tree = new PrintAllPathFromRoot();
        tree.root = new Node(7);
        tree.root.left = new Node(5);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(11);

        tree.findPathFromRoot();
    }
}

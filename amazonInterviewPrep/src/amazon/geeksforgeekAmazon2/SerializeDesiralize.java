package geeksforgeekAmazon2;

class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data, Size s){
        this.data = data;
        s.size++;
        left = right =null;
    }

    Tree(int data){
        this.data = data;
        left = right = null;
    }
    Tree (){}
}

class Size{
    int size = 0;
}

public class SerializeDesiralize {
    Tree root;
    int[] preOrder;
    int[] postOrder;
    int size;
    int initial =0;
    int initial2=0;



    SerializeDesiralize(){
        root = null;
    }

    void convertpreOrder(Tree root){
        if(root == null){
            return;
        }
        if(root.left != null)
            convertpreOrder(root.right);
        convertpreOrder(root.left);
        System.out.println(root.data);
    }
    void createTree(int[] in, int[] pstOrder, int start, int end, int value ){
        int root = postOrder[end-1];
        int mid =-1;
        if(mid==-1){
            mid = start + value + (int)(Math.ceil(end -start)/2)+1;
        }
        System.out.println(root);
        if(mid != -1){
            if((start != mid-value) && (mid-value !=0)){
                createTree(in, pstOrder, start, mid-value, 0 );
            }
            if((mid-value != end -1) && (end -1 !=0 )){
                createTree(in, pstOrder, mid-value, end-1, 1 );
            }
        }
    }
    void processToconvert(Tree root){
        Tree copy1 = root;
        Tree copy2 = root;

        preOrder = new int[size];
        postOrder= new int[size];
        convertBstToInorderArray(copy1);
        convertBstToPostArray(copy2);
    }
    void convertBstToInorderArray(Tree root){
        if(root == null){
            return;
        }
        convertBstToInorderArray(root.left);
        preOrder[initial] = root.data;
        initial++;
        convertBstToInorderArray(root.right);
    }
    void convertBstToPostArray(Tree root){
        if(root == null){
            return;
        }
        convertBstToPostArray(root.left);
        convertBstToPostArray(root.right);
        postOrder[initial2] = root.data;
        initial2++;


    }

    public static void main(String[] args) {
        SerializeDesiralize s = new SerializeDesiralize();
        Size size = new Size();
        s.root = new Tree(20,size);
        s.root.left = new Tree(8,size);
        s.root.left.left = new Tree(4,size);
        s.root.left.right = new Tree(12,size);
        s.root.left.right.right = new Tree(14,size);
        s.root.left.right.left = new Tree(10,size);
        s.root.right = new Tree(22,size);

        s.size =size.size;

        s.processToconvert(s.root);
        System.out.println("Inorder");
        for(int i =0; i < s.size;i++){
            System.out.print(s.preOrder[i]+" ");
        }
        System.out.println("\nPostorder");
        for(int i =0; i < s.size;i++){
            System.out.print(s.postOrder[i]+" ");
        }
        System.out.println("\n");
        s.createTree(s.preOrder, s.postOrder, 0, s.size, 0 );
    }
}

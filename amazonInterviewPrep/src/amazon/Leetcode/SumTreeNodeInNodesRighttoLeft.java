package leetCode;

class Summ{
    int sum=0;
}
public class SumTreeNodeInNodesRighttoLeft {
    static Tree root;
    SumTreeNodeInNodesRighttoLeft(){
        root=null;
    }

    void insert(int data){
        root = insert(this.root, data);
    }
    Tree insert(Tree root, int data){
        if(root ==null){
            root = new Tree(data);
            return root;
        }
        if(data <= root.data){
            root.left = insert(root.left, data);
        }else{
            root.right= insert(root.right, data);
        }
        return root;
    }
    public static void main(String[] args) {
        SumTreeNodeInNodesRighttoLeft a= new SumTreeNodeInNodesRighttoLeft();
        a.insert( 20);
        a.insert(10);
        a.insert(30);
        a.insert(20);
        a.insert(40);
        a.insert(50);
        a.insert(5);
        print(root);
        Summ s = new Summ();
        simplyFySum(root,s);
        System.out.println();
        print(root);
    }

    private static void simplyFySum(Tree root, Summ s) {
        if(root ==null){
           return;
        }
        // post order
        if(root.right != null){
           simplyFySum(root.right,s);
        }
        s.sum = s.sum + root.data;
        root.data= s.sum;
        System.out.println(root.data);
        simplyFySum(root.left, s);
    }

    private static void print(Tree root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            print(root.left);
        }System.out.print(root.data+" ");
        print(root.right);
    }
}

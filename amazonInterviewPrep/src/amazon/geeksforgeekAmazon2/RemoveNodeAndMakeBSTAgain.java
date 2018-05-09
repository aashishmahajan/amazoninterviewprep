package geeksforgeekAmazon2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveNodeAndMakeBSTAgain {
    static Tree root;
    static List<Integer> list;
    static int ind=0;
    RemoveNodeAndMakeBSTAgain(){
        root = null;
        list = new ArrayList<>();
    }

    public void makeBst(Tree root){
        if(root == null){
            return;
        }
        if(root.left != null){
            makeBst(root.left);
        }
        list.add(root.data);
        makeBst(root.right);
    }

    public void createTree(List list, Tree root){
        if(root ==null){
            return;
        }
        if(root.left !=null){
            createTree(list, root.left);
        }
        root.data = (int)list.get(ind);
        ind++;
        createTree(list,root.right);
    }

    public static void main(String[] args) {
        RemoveNodeAndMakeBSTAgain r = new RemoveNodeAndMakeBSTAgain();
        Size  s = new Size();
        r.root = new Tree(10,s);
        r.root.left = new Tree(11,s);
        r.root.right = new Tree(2,s);
        r.root.left.left = new Tree(14,s);
        r.root.left.right = new Tree(4,s);
        r.root.right.left = new Tree(18,s);
        r.root.right.right = new Tree(1,s);


        r.makeBst(r.root);
        Collections.sort(list);
        r.createTree(list, r.root);

        //removeNode(r.root, 10);

        //print(r.root);

        r.addNode(r.root, 10);

        print(r.root);
    }

    private Tree addNode(Tree root, int i) {
        if(root == null){
            root = new Tree(i);
            return root;
        }
        if(root.data > i){
            root.left = addNode(root.left, i);
        }else if(root.data<i){
            root.right = addNode(root.right, i);
        }else{
            /*if(root.data == i){
                list.clear();
                makeBst(root);
                list.add(i);
            }*/
        }
        return root;
    }

    private static void print(Tree root) {
        if(root ==null){
            return;
        }
        if(root.left!=null){
            print(root.left);
        }
        System.out.println(root.data);
        print(root.right);
    }

    private static Tree removeNode(Tree root, int i) {

        if(root == null){
            return root;
        }
        if(i < root.data ) {
            root.left = removeNode(root.left, i);

        } else if( root.data < i){
            root.right = removeNode(root.right, i);
        } else {
            if(root.left == null){
                return  root.right;
            } else  if(root.right == null){
                return root.left;
            }
            root.data = minValueOnRight(root.right);
            root.right = removeNode(root.right, root.data);
        }
        return root;
    }

    private static int minValueOnRight(Tree root) {
        int curDMin = root.data;

        while(root.left !=null){
            curDMin = root.left.data;
            root = root.left;
        }
        return curDMin;
    }
}

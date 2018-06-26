package yahoo;

class Size{
    int size;
    Size(){
        size =0;
    }
}
class Node{
    int data;
    Node next;
    Size s = new Size();
    Node(int data){
        this.data= data;
        s.size++;
    }
}
class sortStackInAsc{
    Node root;
    static Size size;

    sortStackInAsc(){
        root = null;
        size = new Size();
    }

    public void push(Node root, int data) {
        if(root !=null && size.size > root.size ){
            this.root = push(root, data);
        }
        System.out.println("Cant insert, the stack is full");
    }

    void pushIn(Node root,int data){
        if(root == null){
            root = new Node(data);
        }
        Node tmp = root ;
        while(tmp.data < data){
            tmp = tmp.next;
        }
        Node forw = tmp;
        tmp = new Node(data);
        tmp.next= forw;
        return root;
    }

    public boolean isEmpty(Node root){
        if(root == null){
            return true;
        }
        return false;
    }

    public boolean isFull(Node root){
        if(size.size == root.size){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        sortStackInAsc s = new sortStackInAsc();
        size.size =5;
        s.push(s.root,10 );
        s.push(s.root,1 );
        s.isFull(s.root);
        s.push(s.root,12 );
        s.push(s.root,3 );
        s.push(s.root,2 );
    }
}
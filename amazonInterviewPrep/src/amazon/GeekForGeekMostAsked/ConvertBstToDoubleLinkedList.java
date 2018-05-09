package GeekForGeekMostAsked;

public class ConvertBstToDoubleLinkedList {
    Node root;
    Node head;

    ConvertBstToDoubleLinkedList(){
        this.root = null;
    }

    private void print(Node root){
        if(root ==null){
            return;
        }

        if(root.left != null){
            print(root.left);
        }
        System.out.print(root.data+" ");

        print(root.right);
    }
    void printList(Node head)
    {
        System.out.println("Extracted Double Linked List is : ");
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.right;
        }

    }
    public static void main(String[] args) {
        ConvertBstToDoubleLinkedList c  = new ConvertBstToDoubleLinkedList();
        c.root = new Node(10);
        c.root.left = new Node(12);
        c.root.left.left = new Node(25);
        c.root.left.right = new Node(30);

        c.root.right = new Node(15);
        c.root.right.left = new Node(36);

        c.print(c.root);
        System.out.println();
        c.convertToBst(c.root);
        c.printList(c.head);
        System.out.println();

    }

    private void convertToBst(Node root) {
        if(root ==null){
            return;
        }
        convertToBst(root.right);

        root.right = head;
        if(head != null){
            head.left = root;
        }
        head =root;
        convertToBst(root.left);
    }
}

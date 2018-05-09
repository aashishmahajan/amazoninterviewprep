package yahoo;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class careerCuplist {
    static Node root;
    static Node odds;
    static Node even;

    careerCuplist(){
        root = odds=even =null;
    }

    void print(Node root){
        while(root!=null){
            System.out.println(root.data);
            root =root.next;
        }
    }

    void seprator(Node root){
        while(root != null){
            if(root.data % 2 != 0){
                if(odds ==null){
                    odds = new Node(root.data);
                }else{
                    odds = addData(root.data, odds);
                }
            }else{
                if(even ==null){
                   even= new Node(root.data);
                }else{
                    even = addData(root.data, even);
                }
            }
            root = root.next;
        }
    }

    private Node addData(int data, Node node) {
        Node prev = node;
        Node ne = new Node(data);
        while (prev.next != null) {
            prev = prev.next;
        }
        prev.next = ne;
        return node;
    }

    public static void main(String[] args) {
        careerCuplist  c = new careerCuplist();
        root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        c.print(root);
        c.seprator(root);
        System.out.println();
        c.print(odds);
        System.out.println();
        c.print(even);
    }
}

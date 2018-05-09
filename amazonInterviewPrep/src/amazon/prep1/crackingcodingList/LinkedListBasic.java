package prep1.crackingcodingList;

public class LinkedListBasic {
    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

        public static void main(String[] args) {
            Node a = new Node(5);
            a.next = new Node(6);
            a.next.next = new Node (7);
            a.next.next.next = new Node(8);
            a.next.next.next.next = new Node(9);

            print(a);
            a = appendToTail(a, 10);
            deleteEle(a,5);
        }

    private static Node appendToTail(Node a, int i) {
            Node end = new Node(i);
            Node n = a;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
            /*print(a);*/
            return a;
    }


    public static void print(Node node){
        while(node !=null){
            System.out.println(node.data);
            node = node.next;
        }

        System.out.println("\n");
    }

    public static void deleteEle(Node node , int k){
        Node copy = node;
        if(copy.data == k){
            node =node.next;
        /*    print(node);*/
        }else{
            while(copy.next !=null){
                if(copy.next.data == k){
                    copy.next = copy.next.next;
                }
                copy =copy.next;
            }
        }
/*        print(node);*/
    }
}

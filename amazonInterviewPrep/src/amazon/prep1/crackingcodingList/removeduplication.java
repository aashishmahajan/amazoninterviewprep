package prep1.crackingcodingList;

public class removeduplication {
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        a.next = new Node(6);
        a.next.next = new Node(7);
        a.next.next.next = new Node(5);
        a.next.next.next.next = new Node(8);
        a.next.next.next.next.next = new Node(5);
        a.next.next.next.next.next.next = new Node(7);
        removeDup(a);
    }

    private static void removeDup(Node node) {
        Node copy = node;
        while(copy != null && copy.next != null) {
            Node copy2 = copy;
            while (copy2.next  != null) {
                if (copy.data == copy2.next.data) {
                    copy2.next = copy2.next.next;
                }else{
                    copy2 = copy2.next;
                }
            }
            copy = copy.next;
        }
        printNode(node);
    }
    private static void printNode(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println("\n\n");
    }
}

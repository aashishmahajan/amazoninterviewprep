package prep1.crackingcodingList;

public class removeElement {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(3);
        a.next.next = new Node(4);
        a.next.next.next = new Node(5);

        remove(a, 4);
    }

    private static void remove(Node a, int i) {
        Node removeNode = a;
        while(removeNode.next != null){
            if(removeNode.next.data == i){
                removeNode.next = removeNode.next.next;
            }
            removeNode = removeNode.next;
        }
        printa(a);
    }
    private static void printa(Node a){
        while(a !=null){
            System.out.println(a.data);
            a = a.next;
        }
    }
}

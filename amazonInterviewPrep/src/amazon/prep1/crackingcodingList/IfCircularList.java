package prep1.crackingcodingList;

public class IfCircularList {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next =new Node(3);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next =new Node(2);
        head.next.next.next.next.next.next =new Node(2);
        System.out.println(isCiruclar(head));
    }

    private static boolean isCiruclar(Node head) {
        //reference comparison
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                System.out.println("Found loop");
                return true;
            }
        }
        return false;
    }
}

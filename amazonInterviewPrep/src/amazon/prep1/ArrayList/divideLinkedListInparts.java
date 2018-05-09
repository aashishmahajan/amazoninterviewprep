package prep1.ArrayList;

public class divideLinkedListInparts {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(4);
        root.next.next.next.next = new Node(5);
        root.next.next.next.next.next = new Node(6);
        root.next.next.next.next.next.next = new Node(7);
        root.next.next.next.next.next.next.next = new Node(8);
        root.next.next.next.next.next.next.next.next = new Node(9);


        split(root, 2);

    }

    private static Node[] split(Node root, int k) {
        Node cur = root;
        int N = 0;


        while (cur != null) {
            cur = cur.next;
            N++;
        }

        int width = N / k, rem = N % k;

        Node[] ans = new Node[k];
        cur = root;
      /*  for (int i = 0; i < k; i++) {
            Node head = new Node(0), write = head;
            for (int j = 0; j < width + (i < rem ? 1 : 0); ++j) {
                write =  write.next = new Node(cur.data);
                if (cur != null) cur = cur.next;
            }
            ans[i] = head.next;
        }*/
        return ans;
        }
}
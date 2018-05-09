package GeekForGeekMostAsked;

class LNode{
    int data ;
    LNode next;
    LNode(int data){
        this.data = data;
        next = null;
    }
}
public class reverseKsizeLinkedList {
    LNode head;

    reverseKsizeLinkedList(){
        head = null;
    }

    void push(int data){
        LNode l = new LNode(data);
        l.next = head;
        head = l;
    }
    void printList(LNode head){
        LNode l = head;
        while(l != null){
            System.out.println(l.data);
            l = l.next;
        }
    }

    LNode reverseList(LNode root, int k){
        LNode current = root;
        LNode prev = null;
        LNode next = null;
        int c = 0;
        while(c < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            c++;
        }
        if(next!=null){
             root.next = reverseList(next, k);
        }
        return prev;
    }
    public static void main(String[] args) {
        reverseKsizeLinkedList k = new reverseKsizeLinkedList();
        k.push(1);
        k.push(2);
        k.push(3);
        k.push(4);
        k.push(5);
        k.push(6);

        k.printList(k.head);
        System.out.println();
        LNode l = k.reverseList(k.head, 3);

        k.printList(l);
    }
}

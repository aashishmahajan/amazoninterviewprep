package Leetcode;


public class RemoveLoopFromLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next =null;
        }
    }

    static Node head;
    RemoveLoopFromLinkedList(){
        head = null;
    }

    public static void main(String[] args) {
        RemoveLoopFromLinkedList list = new RemoveLoopFromLinkedList();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = head.next.next;
        /*r.print(r.head);*/

        list.detectCycle(head);
        list.print(head);
    }

    void print(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    void detectCycle(Node head){
        if(head == null){
            return;
        }
        Node fast = head, slow = head;
        slow = slow.next;
        fast = fast.next.next;
        while(fast != null || fast.next !=null){
            if(slow == fast){
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow==fast){
            slow= head;
            while(slow.next != fast.next){
                slow= slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}

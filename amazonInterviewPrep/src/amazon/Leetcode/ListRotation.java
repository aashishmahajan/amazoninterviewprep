package Leetcode;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
public class ListRotation {
    Node root;
    ListRotation(){
        root = null;
    }
    public static void main(String[] args) {
        ListRotation lr = new ListRotation();
        lr.root= new Node(1);
        lr.root.next= new Node(2);
        lr.root.next.next= new Node(3);
        lr.root.next.next.next= new Node(4);
        lr.root.next.next.next.next= new Node(5);
        printLr(lr.root);
        System.out.println();
        /*lr.root = rotateListl(lr.root,2);*/
        /*lr.root = rotateList(lr.root,2);*/
        lr.root = dedicateRotation(lr.root,1);
        printLr(lr.root);

        dedicateRotation(lr.root,1);
    }

    private static void printLr(Node root) {
        while(root != null){
            System.out.println(root.data);
            root= root.next;
        }
    }

    private static Node rotateListl(Node head, int k) {
        if(head ==null){
            return head;
        }
        Node fast=head, slow=head;
        int l =0;
        for(l=1; fast.next !=null&& l<=k; l++){
            fast = fast.next;
        }

        while(fast.next!=null){
            fast = fast.next;
            slow= slow.next;
        }

        fast.next = head;
        head = slow.next;
        slow.next= null;
        return head;
    }

    private static Node rotateList(Node root, int length) {
        if(root==null){
            return root;
        }
        Node prev=null,tmp=null;
        Node cur = root;
        int i=length;
        while(i-->0 && root!=null){
            tmp = root.next;
            root.next = prev;
            prev = root;
            root = tmp;
        }

        if(tmp!=null){
            cur.next = rotateList(tmp,length);
        }
        return prev;
    }

    private static Node dedicateRotation(Node root, int k){
        if(root ==null){
            return root;
        }
        Node firstEl = root;
        Node fast=root.next, slow = root.next;
        int i =0;
        for(i=1; fast.next!=null && i<=k ;i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = root;
        root =slow.next;
        slow.next=null;
        return root;
    }
}

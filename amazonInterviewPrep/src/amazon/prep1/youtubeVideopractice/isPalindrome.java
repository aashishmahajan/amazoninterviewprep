package prep1.youtubeVideopractice;
    /*
    * 1. reverse a string and compare, if equal, yes . space complexity
    * 2. take a stack , push the values of the length, till mid for even/ mid-1 for odd, and then pop it opp from
    * mid+1, length -1
    * 3. keep 2 pointers and compare the values
    *
    * */


import java.util.Stack;

public class isPalindrome {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

        static boolean isPalindrome(Node n){
            if(n == null){
                return false;
            }
            Node cur = n;
            Node runner = n;
            Stack<Integer> stackI = new Stack<>();
            while(runner!=null && runner.next !=null){
                stackI.push(cur.data);
                cur = cur.next;
                runner = runner.next.next;
            }
            if(runner !=null ) cur = cur.next;
            while(cur !=null ){
                if(stackI.pop().intValue() != cur.data){
                    return false;
                }
                cur =cur.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.next = new Node(2);
        root.next.next = new Node(3);
        root.next.next.next = new Node(2);
        root.next.next.next.next = new Node(1);
        System.out.println(root.isPalindrome(root));
    }

}

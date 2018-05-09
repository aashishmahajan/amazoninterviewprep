package prep1.crackingcodingList;

public class RemoveDups {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
        Node(){
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        a.next = new Node(6);
        a.next.next = new Node(7);
        a.next.next.next = new Node(8);
        a.next.next.next.next = new Node(5);
        printNode(a);
        removeDups(a);
        findNthElement(a, 3);

        Node a1 = new Node(5);
        a1.next = new Node(6);
        a1.next.next = new Node(7);
        Node a2 = new Node(5);
        a2.next = new Node(6);
        a2.next.next = new Node(7);

        addtwoLinkedList(a1, a2);
    }

    private static void addtwoLinkedList(Node a1, Node a2) {
        Node sumList= new Node();
        while(a1 != null && a2 !=null){
            Node copy =new Node();
            int sum = a1.data + a2.data;
            if(sum>=10){
                if(sumList.next !=null){
                    copy =sumList;
                    sum +=copy.next.data;
                    copy.next.data = sum-10;
                    copy.next.next = new Node(1);
                }else{
                    copy.data = sum-10;
                    copy.next = new Node(1);
                }
                sumList = copy;
            }else{
                copy.data = sum;
            }

            copy = copy.next;
            a1 = a1.next;
            a2 = a2.next;
        }
    }

    private static void findNthElement(Node a, int n) {
        int countJump =1;
        while(countJump <= n && a.next !=null){
            if(countJump == n){
                System.out.println(a.data);
                break;
            }else{
                countJump++;
                a =a.next;
            }
        }
    }

    private static void printNode(Node node){
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println("\n\n");
    }

    private static void removeDups(Node node){
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
}

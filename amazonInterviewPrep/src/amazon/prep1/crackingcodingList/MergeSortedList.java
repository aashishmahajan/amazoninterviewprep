package prep1.crackingcodingList;

public class MergeSortedList {
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
        public Node(){

        }
    }

    private static Node mergeList(Node l1, Node l2){
        if(l1.next == null && l2.next ==null){
            return null;
        }else if(l1.next==null && l2.next !=null){
            return l2;
        }else if(l1.next != null && l2.next==null){
            return l1;
        }else{
            /*if(l1.data < l2.data){
                l1.next = mergeList(l1.next,l2);
                return l1;
            }else{
                l2.next = mergeList(l1,l2.next);
                return l2;
            }*/
            Node head;
            if (l1.data < l2.data) {
                head = l1;
            } else {
                // swap l1 and l2
                head = l2;
                l2 = l1;
                l1 = head;
            }
            while(l1.next != null) {
                if (l1.next.data > l2.data) {
                    Node tmp = l1.next;
                    l1.next = l2;
                    l2 = tmp;
                }
                l1 = l1.next;
            }
            l1.next = l2;
            return head;
        }
    }

    public static void main(String[] args) {
        Node l1 = new Node(3);
        l1.next = new Node(4);
        l1.next.next = new Node (7);

        Node l2 = new Node(1);
        l2.next =new Node(4);
        l2.next.next = new Node(5);
        print(mergeList(l1,l2));
    }
    private static void print(Node node){
        while(node !=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}

package geeksforgeekAmazon2;

public class SwpKthElement {


    public static void main(String[] args) {
        int[] inp ={1 ,2 ,3 ,4 ,5 ,6 ,7 ,8};
        Node n =null;
        int length =0;
        for(int i =0; i < inp.length; i++){
            if(n ==null){
                n = new Node(inp[i]);
                length++;
            }else{
                Node tmp = new Node(inp[i]);
                tmp.next = n;
                n = tmp;
                length++;
            }
        }

        System.out.println("Node length :"+length);
        printNode(n);
        System.out.println("\n");
        swapKthElement(n, length, 3);
        printNode(n);
    }

    private static void printNode(Node n) {
        while(n !=null){
            System.out.println(" " +n.data);
            n = n.next;
        }
    }

    private static void swapKthElement(Node node, int length, int replaceI) {
        if(replaceI > length){
            System.out.println("No swap possible");
            return;
        }
        if(2 * length -1 == replaceI){
            System.out.println("No swap possible");
            return;
        }
        Node next = node;
        Node nextprev =null;

        for(int i =0; i < replaceI ;i++){
            nextprev = next ;
            next = next.next;
        }
        Node tail = node;
        Node tailPrev = null;
        for(int i =0; i < length-replaceI+1; i ++){
            tailPrev =tail;
            tail = tail.next;
        }

        if(next != null){
            nextprev.next = tail;
        }

        if(tail != null){
            tailPrev.next = next;
        }

        Node tmp = next.next;
        next.next = tail.next;
        tail.next = tmp;
        if(replaceI == 1){
            node = tail;
        }
        if(replaceI ==length){
            node = next;
        }

    }
}

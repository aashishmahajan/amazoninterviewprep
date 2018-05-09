package geeksforgeekAmazon2;

public class Multiply2NumberInLinkedList {

    public static double getProduct(Node a, Node b){
        if(a ==null || b ==null){
            return 0.0d;
        }
        int sum = 0;
        double varA =0;
        double varB=0;
        int i =getSize(a)-1;
        for(; i >=0; i--){
            varA += a.data * Math.pow(10,i);
            a = a.next;
        }
        i = getSize(b)-1;
        for(; i >=0; i--){
            varB += b.data * Math.pow(10,i);
            b = b.next;
        }

        return varA* varB;
    }

    private static int getSize(Node a) {
        int i = 0;
        while(a != null) {
            i++;
            a = a.next;
        }return i;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        a.next= new Node(2);;
        a.next.next= new Node(5);

        Node b =new Node(8);
        b.next = new Node(2);

        System.out.println(getProduct(a, b));
    }
}

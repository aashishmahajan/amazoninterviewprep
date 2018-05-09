package prep1.crackingcodingList;

public class leetCodeListtoListArrayWithSizeK {

    static class Node{
        Node next;
        int data ;

        Node(int data){
            this.data = data;
        }
        Node(){}
    }

    public static void main(String[] args) {
        Node inp = new Node(1);
        inp.next= new Node(2);
        inp.next.next= new Node(3);
        inp.next.next.next= new Node(4);
        inp.next.next.next.next= new Node(5);
        inp.next.next.next.next.next= new Node(6);
        inp.next.next.next.next.next.next= new Node(7);
        inp.next.next.next.next.next.next.next= new Node(6);
        inp.next.next.next.next.next.next.next.next= new Node(7);
        //breakInSizeK(new Node(2),1);
        //breakInSizeK(inp, 2);
        splitListToParts(inp,3);

    }

    private static Node[] breakInSizeK(Node inp, int i) {
        if(inp ==null){
            return  null;
        }else if (inp.next == null){
            Node[] a= new Node[1];
            a[a.length-1] = inp;
            return a;
        }else{
            Node leng = inp;
            int l = 0;
            while(leng != null){
                l++ ;
                leng = leng.next;
            }

            int hops = l/i;
            int ext = (l%i);
            Node[] holder = new Node[hops];

            for(int j =0; j < hops;  j++  ){
                holder[i] = inp;
                for(int k=0; k< hops +(j<ext?ext:1);k++){
                    inp = inp.next;
                }
                Node tmp = inp.next;
                inp.next = null;
                inp =tmp;
            }
            return  holder;
        }
    }
    public static Node[] splitListToParts(Node root, int k) {
        Node cur = root;
        int N = 0;
        while (cur != null) {
            cur = cur.next;
            N++;
        }

        System.out.println(N);
        int width = N / k, rem = N % k;

        Node[] ans = new Node[k];
        cur = root;
        for (int i = 0; i < k; i++) {
            Node head = new Node(0);
            Node write = head;
            for(int j=0; j <width+(i<rem?1:0); j++){
                write =write.next = new Node(cur.data);
                if(cur !=null){
                    cur = cur.next;
                }
            }
            ans[i] = head.next;
        }
        return ans;
    }
}

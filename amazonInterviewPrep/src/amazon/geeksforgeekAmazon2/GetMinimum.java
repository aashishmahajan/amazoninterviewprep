package geeksforgeekAmazon2;

 class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

public class GetMinimum {
     Node root;
     Node rootMinCopy;

     GetMinimum() {
         root = null;
         rootMinCopy = null;
     }

     void push(int data){
         if(root == null){
             root = new Node(data);
             rootMinCopy = new Node(data);
         }

         root.next = new Node(data);
         if(rootMinCopy.data > data){
             Node tmp = new Node(data);
             tmp.next = rootMinCopy;
             rootMinCopy = tmp;
         } else {
             Node tmp = new Node(rootMinCopy.data);
             tmp.next = rootMinCopy;
             rootMinCopy = tmp;
         }
     }

     void findMin(){
         if(rootMinCopy != null){
             System.out.println(rootMinCopy.data);
         }
     }

     int pop(){
         if(root ==null){
            return -1;
         }
         int k =root.data;
         root = root.next;
         rootMinCopy = rootMinCopy.next;
         return k;
     }

    public static void main(String[] args) {
        GetMinimum gm = new GetMinimum();
        gm.push(4);
        gm.push(5);
        gm.push(0);
        gm.push(2);
        gm.push(1);
        gm.push(5);
        gm.push(7);
        gm.push(-1);
        gm.findMin();
        gm.pop();
        gm.findMin();



    }
}

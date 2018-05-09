package Leetcode;

public class AddTwoLinkedList {
    Node l1;
    Node l2;

    AddTwoLinkedList(){
        l1 = null;
        l2 = null;
    }
    public static void main(String[] args) {
        AddTwoLinkedList  a = new AddTwoLinkedList();
        a.l1 = new Node(2);
        a.l1.next= new Node(4);
        a.l1.next.next = new Node(3);

        a.l2 = new Node(5);
        a.l2.next= new Node(6);
        a.l2.next.next = new Node(4);

        Node sum = getSumNode(a.l1, a.l2);
        print(sum);
    }

    private static void print(Node sum) {
        while(sum != null){
            System.out.println(sum.data);
            sum = sum.next;
        }
    }

    private static Node getSumNode(Node l1, Node l2) {
        if(l1==null){
            return l2;
        }if(l2 ==null){
            return l1;
        }
        if(l1 == null && l2==null){
            return null;
        }else{
            Node sumList =null;
            Node tmp=null;
            Node prev=null;
            int rem = 0;
            while(l1 !=null || l2 !=null) {
                int sum = l1.data + l2.data + rem;
                rem = (sum >= 10) ? 1 : 0;
                sum = rem == 1 ? sum - 10 : sum;
                tmp = new Node(sum);
                if(sumList ==null){
                    sumList= tmp;
                }else{
                    prev.next = tmp;
                }
                prev = tmp;
                if(l1 !=null){
                    l1 =l1.next;
                }
                if(l2 !=null){
                    l2 = l2.next;
                }
            }
            if(rem>0){
                tmp.next = new Node(rem);
            }
            return sumList;
            }
        }

    }

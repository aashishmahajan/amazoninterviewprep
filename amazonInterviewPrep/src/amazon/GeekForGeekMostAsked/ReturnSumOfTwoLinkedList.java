package GeekForGeekMostAsked;

public class ReturnSumOfTwoLinkedList {
    LNode l1;
    LNode l2;
    ReturnSumOfTwoLinkedList(){
        l1 =null;
        l2 =null;
    }

    LNode Sum(LNode l1, LNode l2){
        LNode sumList =null;
        LNode prev =null;
        LNode tmp = null;
        int carryOver =0;
        while(l1 !=null && l2 != null){
            int tmpsum = carryOver + (l1 !=null?l1.data :0)+
                    (l2 !=null ?l2.data :0);
            carryOver = (tmpsum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            tmpsum = tmpsum % 10;
            tmp = new LNode(tmpsum);
            if(sumList ==null){
                sumList = tmp;
            }else{
                prev.next = tmp;
            }
            prev = tmp;

            if(l1 !=null) {
                l1 = l1.next;
            }
            if(l2 !=null){
                l2 =l2.next;
            }
        }
        if(carryOver >0){
            tmp.next =new LNode(carryOver);
        }
        return sumList;
    }
    public static void main(String[] args) {
        ReturnSumOfTwoLinkedList s = new ReturnSumOfTwoLinkedList();
        s.l1 = new LNode(5);
        s.l1.next = new LNode(6);
        s.l1.next.next = new LNode(3);
        s.l2 = new LNode(8);
        s.l2.next = new LNode(4);
        s.l2.next.next = new LNode(2);

        s.Sum(s.l1, s.l2);
    }
}

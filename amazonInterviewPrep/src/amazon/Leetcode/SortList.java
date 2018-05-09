package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    Node list;
    SortList(){
        list = null;
    }
    public static void main(String[] args) {
        //using list
        List<Integer>  l= new ArrayList<>();
        l.add(10);
        l.add(1);
        l.add(100);
        l.add(7);
        l.add(4);
        l.add(9);
        Collections.sort(l);
        for(int i: l){
            System.out.println(i);
        }


        //using Node
        SortList s = new SortList();
        s.list = new Node(10);
        s.list.next = new Node(1);
        s.list.next.next = new Node(100);
        s.list.next.next.next = new Node(7);
        s.list.next.next.next.next = new Node(4);
        s.list.next.next.next.next.next = new Node(9);

        print(sortNow(s.list));

    }

    private static void print(Node node) {
        while(node !=null){
            System.out.print(node.data +"");
            node = node.next;
        }
    }

    private static Node sortNow(Node list) {
        if(list == null || list.next==null){
            return list;
        }
        Node l1 = list;
        Node l2 = getHeadEnd(list);
        Node l3 = l2.next;
        l2.next = null;

        l1 = sortNow(l1);
        l3 = sortNow(l3);
        return merge(l1,l3);
    }

    private static Node merge(Node l1, Node l2) {
        Node st = new Node(0);
        Node p = st;
        Node p1 = l1;
        Node p2 = l2;
        while(p1 !=null && p2 !=null){
            if(p1.data<p2.data){
                p.next = p1;
            }else{
                p.next = p2;
            }
            p= p.next;
        }
        return st.next;
    }

    private static Node getHeadEnd(Node list) {
        Node l1 = list;
        Node l2 = list;

        while(l1 != null && l2.next !=null){
            if(l2.next ==null || l2.next.next==null){
                return l1;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return list;
    }
}

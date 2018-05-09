package geeksforgeekAmazon2;

import java.util.LinkedList;


public class FlatenList {
    ListNode head;

    class ListNode{
        int data;
        ListNode right;
        ListNode down;
        ListNode(int data){
            this.data = data;
            right=down=null;
        }
    }
    ListNode push(ListNode head_ref, int data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        ListNode new_node = new ListNode(data);

        /* 3. Make next of new Node as head */
        new_node.down = head_ref;

        /* 4. Move the head to point to new Node */
        head_ref = new_node;

        /*5. return to link it back */
        return head_ref;
    }

    public static void main(String[] args) {
        FlatenList f = new FlatenList();
        f.head = f.push(f.head,20);
        f.head = f.push(f.head,8);
        f.head = f.push(f.head,7);
        f.head = f.push(f.head,5);

        f.head.right = f.push(f.head.right,20);
        f.head.right = f.push(f.head.right,20);
    }
}

package geeksforgeekAmazon2;


/*
 * simple and brute force approach have 2 loops, outer to go one by one and inner for
  * uptil i through k element, find max, and continue the for loop
  * complexity :on2
  *
  * second approach is doublyLinkedList aka Deque, that has a front and a back
  * run for first k element, find max, and continue fiori=k till n element and
  * keep adding element to deque
  *
  * o(n)
  * */

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowProble {
    public static void findMax(int[] inp, int k, int length){
        Deque<Integer> dq = new LinkedList<>();
        int i;
        for(i =0; i < k ; i++){
            while(!dq.isEmpty() && inp[i]>= inp[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i < length; i++){
            System.out.println(inp[dq.peek()]);
            while(!dq.isEmpty() && dq.peek() <=i-k ){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && inp[i]>= inp[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.println(inp[dq.peek()]);
    }
    public static void main(String[] args) {
        int[] inp= {48,78,58,90,70,84,50};
        findMax(inp, 3, inp.length);
    }
}

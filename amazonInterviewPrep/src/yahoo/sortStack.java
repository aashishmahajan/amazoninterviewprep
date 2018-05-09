package yahoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class sortStack {
    static Stack s = new Stack();
    sortStack (){
    }
    static class Size{
        int size ;
        Size(){
            size =0;
        }
    }
    static class Stack{
        int data;
        Stack next;
        Size size = new Size();
        Stack(int data) {
            this.data = data;
            next=null;
            size.size++;
        }

        Stack(){}

    }
     static void push(int data) {
        if(s == null ||s.size.size ==0 ) {
            s = new Stack(data);
        }
        else{
            Stack n  =  new Stack(data);
            n.size.size += s.size.size;
            n.next = s;
            s = n;
            s.size.size= n.size.size;
        }
     }

     int pop (){
        if( s.size.size != 0) {
            int k = s.data;
            Stack n = s.next;
            s = n;
            s.size.size--;
            return k;
        }
        return -1;
     }

     static void print(Stack l){
         while(l !=null) {
             System.out.print(l.data +" ");
             l = l.next;
         }
         System.out.println();
     }

     static void sortStack(){
         List<Integer> ls = new LinkedList<>();
         while(s !=null){
            ls.add(s.data);
            s = s.next;
         }
         Collections.sort(ls);
         s = null;
         for(int i : ls) {
             push(i);
         }
     }

    public static void main(String[] args) {
        sortStack stack  = new sortStack();
        stack.push(10);
        stack.push(1);
        stack.push(12);
        stack.push(3);
        stack.push(11);
        stack.push(14);

        print(s);
        stack.pop();
        stack.sortStack();
        print(s);
    }
}

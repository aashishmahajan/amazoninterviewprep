package godaddy;
/*
 * queue : is first in first out.
 *
 * stack is : last in first out.
 *          push and pop
 *
 * */

import java.util.Stack;

public class implementQueuUsing2Stacks {
    static Stack<Integer> s1;
    static Stack<Integer> s2;
    implementQueuUsing2Stacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    void add(int data){
        while(s1.size()>0){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(s2.size()>0){
            s1.push(s2.pop());
        }
        s2 = new Stack<>();
        return;
    }

    int deque(){
        if(s1.size()==0){
            return -1;
        }else{
            return s1.pop();
        }
    }


    public static void main(String[] args) {
        implementQueuUsing2Stacks i = new implementQueuUsing2Stacks();
        i.add(10);
        i.add(1);
        i.add(2);
        i.add(3);
        i.deque();
        while(s1.size() > 0) {
            System.out.println (s1.pop());
        }
    }
}

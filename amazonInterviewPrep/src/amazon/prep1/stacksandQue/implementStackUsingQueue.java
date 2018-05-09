package prep1.stacksandQue;

import java.util.LinkedList;
import java.util.Queue;

public class implementStackUsingQueue {
    Queue<Integer> mainQueue ;
    Queue<Integer> tmp =  new LinkedList<>();

    implementStackUsingQueue(){
        mainQueue = new LinkedList<>();
    }

    void push(int x){
         mainQueue.add(x);
    }

    void pop(){
        if(mainQueue.size() < 1){
            System.out.println("empty stack");
        }else{
            while(mainQueue.size() > 1){
                tmp.add(mainQueue.poll());
            }
            System.out.println(mainQueue.poll());
            mainQueue = tmp;
            tmp = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        implementStackUsingQueue imp = new implementStackUsingQueue();
        imp.push(10);
        imp.push(20);
        imp.push(5);
        imp.push(41);

        imp.pop();
    }
}

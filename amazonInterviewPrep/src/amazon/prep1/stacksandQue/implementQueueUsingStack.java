package prep1.stacksandQue;


import java.util.Stack;

/*
 * stack : plates stack, LIFO , push, pop, peek
 * queue: people queue, FIFO : add, poll
 *
 * */
public class implementQueueUsingStack {
    static Stack<Integer> que = new Stack<>();
    static Stack<Integer> que2 = new Stack<>();
    static int length = 0;


    static void enque(int x){
        que.push(x);
        length ++;
    }

    static void deque(){
        if (que ==null || length ==0){
            System.out.println("no element");
        }
        else if (length ==1){
            System.out.println(que.pop());
        }else{
            int i=0;
            Stack<Integer> tmp = que;
            while(i < length-1){
                i++;
                que2.push(tmp.pop());
            }
            System.out.println(tmp.pop());
            que = new Stack<>();
            while(i > 0 ){
                i--;
                que.push(que2.pop());
            }
            que2 = new Stack<>();
        }
    }

    public static void main(String[] args) {
        implementStackUsingQueue queue = new implementStackUsingQueue();
        enque(10);
        enque(2);
        enque(3);
        enque(5);
        deque();

    }

}

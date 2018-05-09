package prep1.stacksandQue;

import java.util.Stack;

public class StackBasic {
    Stack<Integer> intstack ;
    int minEle ;

    void StackBasic(){
        intstack = new Stack<>();
    }

    void push(int x){

        if(intstack.isEmpty()){
            minEle = x;
            intstack.push(x);
        }else {
            intstack.push(x);
            if (minEle > x) {
                minEle = x;
            }
        }
    }

    void pop(){
        intstack.pop();
    }

    void peek(){
        if(intstack.isEmpty()){
            System.out.println("is empty");
        }else{
            System.out.println(intstack.peek());
        }
    }

    int top(){
        if(intstack.isEmpty()){
            System.out.println("is empty");
            return 0;
        }else{
            return intstack.peek();
        }
    }

    int getMin(){
        if(intstack.isEmpty()){
            System.out.println("is empty");
            return 0;
        }
        else{
            return minEle;
        }
    }


    public static void main(String[] args) {
        StackBasic s = new StackBasic();
        s.push(110);
        s.push(210);
        s.push(10);

        s.getMin();
        s.pop();
    }
}


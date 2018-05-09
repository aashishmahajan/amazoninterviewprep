package GeekForGeekMostAsked;

import java.util.Stack;

public class StackOperationinOone {
    Stack<Integer> cStack ;
    Stack<Integer> minStack;
    StackOperationinOone() {
        cStack = new Stack<>();
        minStack = new Stack<>();
    }


    void push(int data){
        if(cStack.isEmpty()){
            cStack.add(data);
            minStack.add(data);
        }else{
            cStack.add(data);
            int tmp = minStack.peek();
            if(tmp < data){
                minStack.push(tmp);
            }else{
                minStack.push(data);
            }
        }
    }

    void pop(){
        if(cStack.empty()){
            throw new NullPointerException("Stack is empty");
        }else{
            System.out.println("");
            System.out.println("pop'ed value: "+cStack.pop());
            minStack.pop();
        }
    }

    int minValue(){
        if(cStack.empty()){
            throw new NullPointerException("Stack is empty");
        }else{
            return minStack.peek();
        }
    }
    void printStack(){
        Stack<Integer> tmp = (Stack<Integer>) cStack.clone();
        System.out.print ("Stack is: ");
        while(!tmp.empty()){
            System.out.print(tmp.pop()+" ");
        }
        System.gc();
    }

    public static void main(String[] args) {
        StackOperationinOone s = new StackOperationinOone();
        s.push(10);
        s.push(-1);
        s.push(11);
        s.push(0);
        s.push(20);
        s.printStack();
        s.pop();
        System.out.println("min value: "+s.minValue());
    }
}

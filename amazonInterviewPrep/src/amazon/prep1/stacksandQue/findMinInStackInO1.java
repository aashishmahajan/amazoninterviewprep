package prep1.stacksandQue;

import java.util.Stack;

public class findMinInStackInO1 {
    private static int findMin(Stack s){
        int min = (int)s.pop();
        while(!s.isEmpty()){
            int next = (int) s.pop();
            if(min <= next){
                continue;
            }else{
                min = next;
            }
        }return min;

    }
    public static void main(String[] args) {
        Stack<Integer> inp = new Stack();
        inp.push(5);
        inp.push(4);
        inp.push(6);
        inp.push(6);
        inp.push(2);
        System.out.println(findMin(inp));
    }
}

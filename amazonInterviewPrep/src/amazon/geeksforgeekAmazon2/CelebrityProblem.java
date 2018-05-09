package geeksforgeekAmazon2;

import java.util.Stack;

public class CelebrityProblem {
    static int MATRIX[][] = { { 0, 0, 1, 0 },
            { 0, 0, 1, 0 },
            { 0, 0, 0, 0 },
            { 0, 0, 1, 0 } };


    public static void main(String[] args) {
        int numberGuest = 4;
        int c = findCelebrity(numberGuest);
        if(c != -1){
            System.out.println("celebrity exist : "+c);
        }else{
            System.out.println("No celebrity");
        }
    }

    private static int findCelebrity(int numberGuest) {
        if (numberGuest==1) return 1;
        Stack<Integer> s = new Stack<>();
        for(int i =0; i <numberGuest; i++ ){
            s.push(i);
        }

        while(s.size() >1){
            int a = s.pop();
            int b = s.pop();

            if(knows(a,b)){
                s.push(b);
            }else{
                s.push(a);
            }
        }

        int c =s.pop();
        for(int i =0; i < numberGuest ; i++){
            if(c !=i &&(knows(c,i)||!knows(i,c))){
                return -1;
            }
        }
        return c;
    }

    private static boolean knows(int a, int b) {
        boolean res = (MATRIX[a][b] ==1)? true: false;
        return res;
    }
}

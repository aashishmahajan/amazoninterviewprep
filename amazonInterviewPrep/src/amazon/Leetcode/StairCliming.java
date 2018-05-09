package Leetcode;

public class StairCliming {

    /* is sequence of fibonaci series with n+1 return */
    public int getWays(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a=0,b=1;
        int c=0;
        for(int i =2; i <= n+1; i ++){
            c = a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        StairCliming s = new StairCliming();
        System.out.println(s.getWays(4));

        s.printSequece(4, 1,2);

    }

    private void printSequece(int numStr, int jump1, int jump2) {
        if(numStr==jump1){
            System.out.print ("1 ");
            return;
        }
        if(numStr ==jump2){
            System.out.print("2 ");
            return;
        }

        printSequece(numStr-jump1, jump1,jump2) ;
        printSequece(numStr-jump2, jump1,jump2);

    }


}

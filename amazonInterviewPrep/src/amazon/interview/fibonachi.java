package interview;

public class fibonachi {

    int getfib(int n){
        int a =0;
        int b=1;
        int c =0;
        for(int i =2; i < n; i++){
            c = a+b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        fibonachi f = new fibonachi();
        // for 50
        int f50 = f.getfib(49) + f.getfib(48);
    }

}

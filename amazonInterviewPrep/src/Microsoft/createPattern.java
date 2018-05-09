package Microsoft;

public class createPattern {
    static int reduceradder =-5;
    public static void main(String[] args) {
      /*  generatepattern(16);*/
        generateWithoutLoop(16,16,true);
    }

    private static void generatepattern(int i) {
        int last = i + reduceradder;
        System.out.print(i + " ");
        while(last!=i){
            System.out.print(last + " ");
            if(last<=0){
                reduceradder =5;
            }
            last +=reduceradder;
        }
        System.out.print(last);
    }

    private static void generateWithoutLoop(int i, int n, boolean flag){

        System.out.print(n + " ");
        if(!flag && i==n ){
            return;
        }
        if(flag){
            if(n - 5 > 0){
                generateWithoutLoop(i,n-5, true);
            }else{
                generateWithoutLoop(i,n-5, false);
            }
        }else{
            generateWithoutLoop(i,n+5, false);
        }

    }
}

package prep1.ArrayList;

import java.util.Arrays;

public class OptimalDivision {
    static String optimalDiv(int[] inp){
        if(inp.length ==0|| inp ==null ){
            return "empty input";
        }else{
            Arrays.sort(inp);
            if(inp[0]== inp[inp.length-1]){
                return "1";
            }else{
                int div = inp[inp.length-1];
                String divisor ="";
                for(int i= inp.length - 2; i >=1; i--){
                    divisor += inp[i]+"/";
                }
                divisor = div+"/("+ divisor +inp[0]+")";
                return divisor;
            }
        }
    }
    public static void main(String[] args) {
        int[] inp = new int[]{1000, 100, 10, 10, 5};
        System.out.println(optimalDiv(inp));
    }
}

package AmazonPrepGeeks;

import java.util.HashMap;
import java.util.Map;

public class findPairsSumToX {
    // n2 complexity
    private static void checkSum(int[] inp1, int[] inp2, int sum){
        for(int i =0; i < inp1.length; i++ ){
            for(int j = 0 ; j < inp2.length; j ++ ){
                if(inp1[i]+ inp2[j] == sum){
                    System.out.println(inp1[i]+ inp2[j]);
                }
            }
        }
    }

    private static void checkSumLess(int[] inp1, int[] inp2, int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< inp1.length;i++){
            map.put(inp1[i],0);
        }
        for(int i =1; i < inp2.length; i++){
            if(map.containsKey(sum - inp2[i])){
                System.out.println(inp2[i] +"  "+ (sum - inp2[i]));
            }
        }
    }

    public static void main(String[] args) {
        int[] inp1 = new int[]{-1, -2, 4, -6, 5, 7};
        int[] inp2 = new int[]{6, 3, 4, 0};

        checkSum(inp1, inp2, 8);
        checkSumLess(inp1, inp2, 8);
    }
}

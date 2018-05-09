package geeksforgeekAmazon2;

import java.util.HashMap;
import java.util.Map;

public class MinReplacementForPair {
    public static void main(String[] args) {
        Map<Integer,Integer> pair = new HashMap<>();
        pair.put(1,3);
        pair.put(2,4);
        pair.put(5,6);
        pair.put(3,1);
        pair.put(4,2);
        pair.put(6,5);

        int[] inp = {3, 5, 6, 4, 1, 2};
        System.out.println(findMinPair(inp, pair, (int)pair.size()/2, 0));

    }

    private static int findMinPair(int[] inp, Map<Integer, Integer> pair, int numP, int start) {
        if(pair.size() ==0 || inp.length ==0){
            return 0;
        }
        int i =start;
        int countSwap=0;

        if(i < pair.size()){
            int pI = pair.get(inp[i]);
            if(pI!= inp[i+1]){
                countSwap =countSwap+1;
                int[] inpU = swapNowPair(inp, pair, i);
                inp = inpU;
            }
            countSwap += findMinPair(inp,pair,numP,i+2);
        }
        return countSwap;
    }

    public static int[] swapNowPair(int[] inp, Map<Integer,Integer> pair, int pos){
        int val = pair.get(inp[pos]);
        int i = pos+1;
        for( ;i < pair.size(); i ++){
            if(inp[i] == val){
                int tmp = inp[pos+1];
                inp[pos+1] = inp[i];
                inp[i] = tmp;
            }

        }   return inp;
    }
}

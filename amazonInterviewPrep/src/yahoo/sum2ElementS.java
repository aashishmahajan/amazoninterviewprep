package yahoo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sum2ElementS {
    public static void main(String[] args) {
        int[] inp= {10,5,3,2,19,13};
        findIFPossible(inp, 24);
        findIFPossibleNoSort(inp,24);
    }

    private static void findIFPossible(int[] inp, int sum) {
        Arrays.sort(inp);
        int i = 0;
        int j = inp.length-1;
        boolean flag = false;
        while(i != j && !flag ){
            if(sum > inp[i]+inp[j]){
                i++;
            } else if(sum < inp[i] + inp[j]){
                j--;
            }else{
                flag=true;
                break;
            }
        }
        if(flag) {
            System.out.println("the sum exist as "+ inp[i] +", and "+ inp[j]);
        }else {
            System.out.println("Not exist");
        }
    }

    private static void findIFPossibleNoSort(int[] inp, int sum) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i =0; i < inp.length; i++){
            m.put(inp[i],0);
        }

        for(int i : m.keySet()){
            int sec = sum-i;
            if(m.containsKey(sec)){
                System.out.println(i+ "  "+sec);
                break;
            }
        }
    }
}

package prep1.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findMissing {
    static int[] findMissing(int[] inp){
        if(inp.length ==0 || inp ==null){
            return inp;
        }else{
            Arrays.sort(inp);
            List<Integer> missing = new ArrayList<>();
            for(int i = 1; i < inp.length; i++){
                if(inp[i] -inp[i-1] ==0 || inp[i] -inp[i-1] ==1){
                    continue;
                }else{
                    int tmp = inp[i-1]+1;
                    while(tmp < inp[i]){
                        missing.add(tmp);
                        tmp++;
                    }
                }
            }
            int[] missout = new int[missing.size()];
            for(int i =0 ;i < missing.size(); i++){
                missout[i] = missing.get(i);
            }
            return missout;
        }
    }


    public static void main(String[] args) {
        int[] inp =new int[]{4,3,2,7,8,2,3,1};
        int [] out = findMissing(inp);
        for(int i=0; i < out.length; i ++){
            System.out.println(out[i]);
        }
    }
}

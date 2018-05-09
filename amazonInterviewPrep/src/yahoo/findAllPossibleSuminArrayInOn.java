package yahoo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class findAllPossibleSuminArrayInOn {
    static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        int[] inp ={1,3,4,6,7,83,4};
        calcSum(inp);
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+ " ");
        }
    }

    private static void calcSum(int[] inp) {
        if(inp.length==0){
            return;
        }
        int i=0;
        for(int j=i+1; j< inp.length; j++){
            set.add(inp[i]+inp[j]);
            if(j == inp.length-1){
                i++;
                j=i;
            }
        }
    }
}

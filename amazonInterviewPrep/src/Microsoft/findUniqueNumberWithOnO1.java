package Microsoft;

import java.util.HashSet;
import java.util.Set;

public class findUniqueNumberWithOnO1 {
    public static void main(String[] args) {
        int[] inp= {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
        System.out.println(unique(inp));
    }

    private static int unique(int[] inp) {
        Set<Integer> set = new HashSet<>();
        int totsum =0;
        int uniqueSum=0;
        for(int i = 0; i <inp.length; i++) {
            totsum += inp[i];
            if(!set.contains(inp[i])){
                uniqueSum += inp[i];
                set.add(inp[i]);
            }
        }
        return ((3*uniqueSum)-totsum)/2;
    }
}

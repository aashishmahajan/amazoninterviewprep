package Microsoft;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sortEvenThenOdd {

    public static void main(String[] args) {
        int[] inp={1, 3, 2, 7, 5, 4};
        sortOut(inp);
        sortOutGeek(inp, inp.length);
    }

    private static void sortOutGeek(int[] inp, int length) {
        int ini = 0;
        int end = length-1;
        int cOdd = 0;
        while(ini<end){
            if(inp[ini] %2 != 0){
                cOdd++;
                ini++;
            }

        }
    }

    private static void sortOut(int[] inp) {
        Set<Integer> even = new TreeSet<>();
        Set<Integer> odd = new TreeSet<>();
        for(int i=0; i < inp.length; i++){
            if(inp[i]%2==0){
                even.add(inp[i]);
            }else{
                odd.add(inp[i]);
            }
        }
        Iterator<Integer> it = even.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +" ");
        }
        it =odd.iterator();
        while(it.hasNext()){
            System.out.print(it.next() +" ");
        }
    }
}

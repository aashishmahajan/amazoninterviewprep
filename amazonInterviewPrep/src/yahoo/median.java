package yahoo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class median {
    static List<Integer> list= new LinkedList<>();
    public static void main(String[] args) {
        int[] inp ={5,15,1,3};

        for(int i: inp){
            showMedian(i);
        }
    }

    private static void showMedian(int i) {
        list.add(i);
        Collections.sort(list);
        if(list.size()%2==0){
            int med = list.size()/2-1;
            med = (list.get(med)+list.get(med+1))/2;
            System.out.println(med);
        }else{
            int medind = (int)Math.floor(list.size()/2);
            System.out.println(list.get(medind) );
        }
    }
}

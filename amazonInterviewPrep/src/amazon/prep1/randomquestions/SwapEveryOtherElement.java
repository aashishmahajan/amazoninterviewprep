package prep1.randomquestions;

import java.util.LinkedList;
import java.util.List;

public class SwapEveryOtherElement {

    private static List<Integer>swapNow(List<Integer> swapAlertnate, int size ){
        List<Integer> swaped = new LinkedList<>();
        if(size %2 == 0){
            for(int i = 0; i < size ; i++ ){
                swaped.add(swapAlertnate.get(i+1));
                swaped.add(swapAlertnate.get(i));
                i++;
            }
        }else{
            for(int i = 0; i < size -1 ; i++ ){
                swaped.add(swapAlertnate.get(i+1));
                swaped.add(swapAlertnate.get(i));
                i++;
            }
            swaped.add(swapAlertnate.get(size-1));
        }
        System.out.println(swaped.toString());
        return swaped;
    }

    public static void main(String[] args) {
        List<Integer> swapAlertnate = new LinkedList<>();
        swapAlertnate.add(1);
        swapAlertnate.add(2);
        swapAlertnate.add(3);
        swapAlertnate.add(4);
        swapAlertnate.add(5);
        swapAlertnate.add(6);
        swapAlertnate.add(7);
        swapAlertnate.add(8);
        swapNow(swapAlertnate , swapAlertnate.size());

        List<Integer> swapAlertnateO = new LinkedList<>();
        swapAlertnateO.add(1);
        swapAlertnateO.add(2);
        swapAlertnateO.add(3);
        swapAlertnateO.add(4);
        swapAlertnateO.add(5);
        swapAlertnateO.add(6);
        swapAlertnateO.add(7);
        swapNow(swapAlertnateO , swapAlertnateO.size());

    }


}

package yahoo;

import java.util.*;

public class LRU {
    static List<Integer> list;
    static Map<Integer, Integer> map;
    LRU() {
        list = new LinkedList<>();
        map = new HashMap<>();
    }
    void processEvent(int data){
        if(list.size()==3 && list.contains(data)){
            list.remove(list.indexOf(data));
            list.add(data);
            keeprecords(data);
        }else if(list.size()==3){
            list.remove(0);
            list.add(data);
            keeprecords(data);
        }else {
            list.add(data);
            keeprecords(data);
        }
    }

    void keeprecords(int data){
        if(map.containsKey(data)){
            map.put(data, map.get(data)+1);
        }else{
            map.put(data, 1);
        }
    }
    public static void main(String[] args) {
        int[] inp = {1,2,1,3,2,3,1,2,3,4,1,2,3,5};
        LRU lru = new LRU();
        for(int i: inp){
            lru.processEvent(i);
        }
        System.out.println();
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: map.keySet()){
            System.out.println("entry "+i +" entry count :" +map.get(i));
        }
    }

}

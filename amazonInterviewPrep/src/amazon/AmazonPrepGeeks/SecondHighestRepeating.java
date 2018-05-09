package AmazonPrepGeeks;

import java.util.*;
import java.util.Map.Entry;

public class SecondHighestRepeating {

    static void findSecondHigest(String[] inp){
        Map<String, Integer> map = new HashMap<>();
        for(String s: inp) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }

        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String,Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int max = list.get(0).getValue();

        for(int i=0; i < list.size(); i++){
            if(list.get(i).getValue() < max) {
                System.out.println(list.get(i).getKey());
                max = list.get(i).getValue();
                break;
            }
        }
    }

    public static void main(String[] args) {
        String[] inp = {"aaa","bbb","ccc","bbb" ,"aaa" ,"aaa"};
        findSecondHigest(inp);
    }
}

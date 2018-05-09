package prep1.youtubeVideopractice;

/* couple of solution
 * 1. create a hashmap for string vs value, and then sort it using custom comparator
 *
 * 2. store the values in Hashtree, sort of binary amazon.tree sorts automatically
 *
 * 3. questions to be asked, is the casing to be considered or ignred.
 * */

import java.util.*;

public class findKMostFrequentString {
    static public String findKFrequent(String[] inp, int k) {
        if(inp.length ==0 || k==0){
            return "";
        }
        Map<String, Integer> stringStore = new HashMap<>();
        for(String s : inp){
            if(stringStore.containsKey(s)){
                stringStore.put(s, stringStore.get(s)+1);
            }else{
                stringStore.put(s, 1);
            }
        }

        List<Map.Entry> list = new ArrayList<>(stringStore.entrySet());
        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                Integer val1 = (Integer)((Map.Entry)o1).getValue();
                Integer val2 = (Integer)((Map.Entry)o2).getValue();
                return - val1.compareTo(val2);
            }
        });
        if(list.size() > k){
            return (String) list.get(k-1).getKey();
        }
        return "";
    }

    public static void main(String[] args) {
        String[] inp = {"this", "this","I", "I", "I", "here", "here", "here", "here"};
        System.out.println(findKFrequent(inp, 2));
    }
}

package yahoo;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingInStream {
    public static void main(String[] args) {
        char[] inp = {'a','b','c','a','b'};
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c: inp) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for(char c: map.keySet()){
            if(map.get(c)==1){
                System.out.println("firstNonRepeatingInStream :"+c);
            }
        }
    }
}

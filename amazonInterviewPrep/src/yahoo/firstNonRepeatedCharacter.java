package yahoo;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatedCharacter {

    public static void main(String[] args) {
        String s = "iamhereintheworldtolove";
        getFirstNonRepetedCharacter(s.toCharArray(), s.length());

    }

    private static void getFirstNonRepetedCharacter(char[] chars, int length) {
        Map<Character, Boolean>  map = new LinkedHashMap<>();
        for(int i =0; i < length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i],false);
            }else{
                map.put(chars[i],true);
            }
        }
        for(char i: map.keySet()){
            if(map.get(i)){
                System.out.println(i);
                break;
            }
        }
    }

}

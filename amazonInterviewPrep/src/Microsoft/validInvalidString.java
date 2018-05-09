package Microsoft;

import java.util.HashMap;
import java.util.Map;

public class validInvalidString {
    static boolean isValid(char[] c){
        Map<Character, Integer> map = new HashMap<>();
        for(char i :c){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int threshold =map.get(c[0]);
        boolean flag = true;
        for(char car : map.keySet()){
            if(car != c[0] && map.get(car)!= threshold){
                flag = false;
                break;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        String s ="this is a wild brown fox";
        String s2 ="abcdefg abcdefg abcdefg ";

        System.out.println(isValid(s.toCharArray()));;
        System.out.println(isValid(s2.toCharArray()));;
    }
}

package yahoo;

import java.util.*;

public class removeDuplicateCharacter {
    public static void main(String[] args) {
        String s = "abracadabra";
        removeDups(s.toCharArray());
    }

    private static void removeDups(char[] chars) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i =0; i< chars.length; i++) {
            set.add(chars[i]);
        }
        Iterator<Character> i = set.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }
    }
}

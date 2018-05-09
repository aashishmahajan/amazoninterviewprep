package yahoo;

import java.util.ArrayList;
import java.util.List;

public class removeAdjacentDups {
    public static void main(String[] args) {
        String s = "ABCCBCBA";
        String s2 = "AA";
        removeDupAdj(s.toCharArray());
        removeDupAdj(s2.toCharArray());
    }

    private static void removeDupAdj(char[] chars) {
        if(chars.length<3){
            if(chars.length ==2){
                if(chars[0] ==chars[1]){
                    System.out.println(-1);
                }else{
                    System.out.println(chars[0]+" "+chars[1]);
                }
            }else{
                System.out.println(chars[0]);
            }
        }else{
            List<Character> l = new ArrayList<>();
            for(char i: chars){
                l.add(i);
            }
            for(int i =0; i < l.size() - 2; i++){
                if(l.get(i)== l.get(i+1)){
                    l.remove(i);
                    l.remove(i);
                    i=i-2;
                }
            }
            System.out.println(l.toString());
        }

    }
}
